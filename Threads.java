//thread is smallest unit 
//they can be excuted parallely

//class when extends Thread becomes a thread
//thread class here A should have run method
//object.start() call the run method

//as java doesnot allow multiple inheritance so instead of extending class we implement Runnable interface
//Runnable doesnot have start() it has only run()
//so we created Thread obj and pass the Runnable implementing class obj (which also a runnable obj)

class C implements Runnable{
    public void run(){
        for (int i=0;i<10;i++){
            System.out.println("Hi Shirisha");
            try {
                Thread.sleep(10);
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
        }
    }
}
class A extends Thread{
    public void run(){
        for (int i=0;i<10;i++){
            System.out.println("Hi");
            try {
                Thread.sleep(10);
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
        }
    }
}
class B extends Thread{
    public void run(){
        for (int i=0;i<10;i++){
            System.out.println("Hello");
            try {
                Thread.sleep(10);
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
        }

    }
}
public class Threads {
    public static void main(String[] args) {
        A obj1=new A();
        B obj2=new B();
        obj1.setPriority(Thread.MAX_PRIORITY);
        System.out.println(obj1.getPriority());
        System.out.println(obj2.getPriority());
        obj1.start();
        obj2.start();

        C obj3= new C();
        Thread th=new Thread(obj3);
        th.start();

        //anonymous class
        Runnable r=new Runnable() {
            public void run(){
                for (int i=0;i<10;i++){
                    System.out.println("Hello shirisha");
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException ex) {
                        ex.printStackTrace();
                    }
                }
        
            }
        };
        Thread th1=new Thread(r);
        th1.start();

        //lambda expression
        Runnable r1=()->{
                for (int i=0;i<10;i++){
                    System.out.println("Hello shirisha...");
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException ex) {
                        ex.printStackTrace();
                    }
                }
        };
        Thread th2=new Thread(r1);
        th2.start();
    }
}
