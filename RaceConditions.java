//thread safe to avoid issue occur due to mutation
//synchronized makes sure incr() is called by one thread at a time

//states of thread
//New
//Runnable: when start() new to runnable, or notify waiting to runnable state
//Running: when run() runnable to running
//waiting: when sleep() or wait() 
//dead: stop() running to dead or runnable to dead
class Counter{
    int count;
    //synchronized makes sure incr() is called by one thread at a time
    public synchronized void incr(){
        count++;
    }
}

public class RaceConditions {
    public static void main(String[] args) throws InterruptedException {
        Counter c=new Counter();
        Runnable obj1=()->{
            for (int i=0;i<5000;i++){
                c.incr();
            }
        };
        Runnable obj2=()->{
            for (int i=0;i<5000;i++){
                c.incr();
            }
        };
        Thread t1=new Thread(obj1);
        Thread t2=new Thread(obj2);
        t1.start();
        t2.start();
        //to wait for t1 and t2
        t1.join();
        t2.join();
        System.out.println(c.count);
    }
    
}
