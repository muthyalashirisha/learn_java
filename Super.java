//super()
//every constructor has super() even though we dont explicitly mention
//every class extends object class even if not explicitly mentioned
//super() calls parent class default constructor
//super(parameters..) calls parent class paramertized constructor
//this() calls current class default constructor
//this(parameters..) calls parent class paramertized constructor
class A{
    A(){
        super();
        System.out.println("A default"); 
    }
    A(int n){
        super();
        System.out.println("A parameterized"); 
    }
}
class B extends A{
    B(){
        super();//present even if not mentioned
       System.out.println("B default"); 
    }
    B(int n){
        super(n);
       System.out.println("B parameterized"); 
    }
}
public class Super {
    public static void main(String[] args) {
        B obj=new B(4);
        B obj1=new B();
    }
}
