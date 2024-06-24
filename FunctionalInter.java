//A functional interafce has only one method defination
//it is used for lamba expressions
@FunctionalInterface
interface A{
    void show();
}

public class FunctionalInter {
    public static void main(String[] args) {
        A obj = new A(){
            public void show(){
                System.out.println("show()");
            }
        };
        obj.show();
    }
}
