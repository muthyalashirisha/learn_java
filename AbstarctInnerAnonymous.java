abstract class A{
    public  abstract void show();
    public abstract void config();
}
public class AbstarctInnerAnonymous {
    public static void main(String[] args) {
        A obj = new A(){
            public void show() {
                System.out.println("new show()");
            }

            public void config() {
                System.out.println("new config()");
            }
        };

        obj.config();
        obj.show();
    }
}
