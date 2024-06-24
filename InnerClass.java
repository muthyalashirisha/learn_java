//Inner class- A class inside another class
//outer class cannot be static

//outer class
class A{
    public void show(){
        System.out.println("show()");
    }

    //inner class
    class B{
        public void config(){
            System.out.println("config()");
        }
    }

    static class C{
        public void configure(){
            System.out.println("config()");
        }
    }
}


public class InnerClass {
    public static void main(String[] args) {
        A obj1 = new A();
        obj1.show();

        //to access inner class we need outer class obj
        A.B obj2 = obj1.new B();
        obj2.config();

        // static inner class can be accessed using Class Name
        A.C obj3 = new A.C();
        obj3.configure();

        //anonymous inner class
        //this will be the inner class on InnerClass
        A obj4 = new A(){
            public void show(){
                System.out.println("new show()");
            }
        };
        obj4.show();
    }
}
