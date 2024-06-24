//casting- downcasting, upcasting
// typecasting: explicit conversion of data ex from double to int
class A{
    public void show1(){
        System.out.println("show1()");
    }
}
class B extends A{
    public void show2(){
        System.out.println("show2()");
    }
}
public class Casting {
    public static void main(String[] args) {
        //upcasting
        //parent reference child object
        A obj1=new B();
        obj1.show1();

        //we can call show2() as A dont know about show2()
        //down casting
        //come back to child refrence
        B obj2=(B)obj1;
        obj2.show2();
    }
}
