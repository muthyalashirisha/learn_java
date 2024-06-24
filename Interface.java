//Interface : all the methods in interface are public abstract
// all the variables inside interface are final and static
// static because we get only methods in implements not variables. We donnot instanciate interface we instantiate class.
//final because interface donnot have their memory in heap
interface A{
    int age=24;
    String area="hyd";
    void show();
    void config();
}

interface C{
    void run();
}

interface D extends C{

}

class B implements A,D{

    public void show() {
        System.out.println("show()");
    }

    public void config() {
        System.out.println("config()");
    }

    public  void run(){
        System.out.println("run()");
    }
    
}
public class Interface {
    public static void main(String[] args) {
        // A obj ;
        // obj = new B();
        A obj = new B();
        obj.config();
        obj.show();

        D obj1 = new B();
        obj1.run();

        System.out.println(A.age);
        System.out.println(A.area);
    }
}
