@FunctionalInterface
interface A{
    void show();
}

@FunctionalInterface
interface B{
    void show(int i);
}

@FunctionalInterface
interface C{
    int add(int i,int j);
}
public class Lambaexp {
    
    public static void main(String[] args) {
        A obj = new A(){
            public void show(){
                System.out.println("show()");
            }
        };
        obj.show();

        A obj1 = ()->{
                System.out.println("show()");
            };
            obj1.show();

        B obj3 = new B(){
            public void show(int i){
                System.out.println("show()"+" "+i);
            }
        };
        obj3.show(5);

        B obj4 = (i)->{
            System.out.println("show()"+" "+i);
            };
        obj4.show(5);

        B obj5 = i->{
            System.out.println("show()"+" "+i);
            };
        obj5.show(5);

        C ad = new C(){
            public int add(int i, int j){
                return i+j;
            }
        };
        int res=ad.add(5,6);
        System.out.println("res:"+res);

        C ad1 = (int i, int j)-> i+j;
        int res1=ad1.add(5,6);
        System.out.println("res:"+res1);
    }
}

