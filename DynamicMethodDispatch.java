class A{
    public void show(){
        System.out.println("In A:Show()");
    }
}
class B extends A{
    public void show(){
        System.out.println("In B:Show()");
    }
}
class C extends A{
    public void show(){
        System.out.println("In C:Show()");
    }
}
public class DynamicMethodDispatch {
    public static void main(String[] args) {
        A a=new A();
        a.show();
        //we can use parent type to its child object
        //which method to be called is decided at run time so it is a example of dynamic polymorphism
        //and It is dymanic method dispatch
        a=new B();
        a.show();
        a=new C();
        a.show();
    }
}
