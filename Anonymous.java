class A{
    A(){
        System.out.println("A constructor");
    }
    void show(){
        System.out.println("A show");
    }
}
class Anonymous{
    public static void main(String[] args) {
        A a;//reference variable
        a=new A();

        //anonymous obj
        //can not be reused
        // new A();
        new A().show();
    }
}