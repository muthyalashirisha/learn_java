//enum are named constants
//enum is a class
//enum extends Enum class by default
//except cannot extend class

enum Status{
    Running,Failed,Success
}

enum Laptop{
    Macbook(2000), XPS(2200), Surface(), ThinkPad(1000);
    private int price;

    //private constructor because we are creating Object in same class
    private Laptop() {
        price=500;
    } 

    private Laptop(int price) {
        this.price = price;
        System.out.println(this.name());
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
     
}
public class Enum {
    public static void main(String[] args) {
        Status s = Status.Failed;
        // System.out.println(s.ordinal());
        // System.out.println(s);
        // Status[] s1 = Status.values();
        // System.out.println(s1[0]);

        if(s==Status.Running){
            System.out.println("running");
        }else if (s==Status.Failed){
            System.out.println("failed");
        }else {
            System.out.println("Success");
        }

        switch(s){
            case Running:
            System.out.println("running");
            break;
            case Success:
            System.out.println("success");
            break;
            case Failed:
            System.out.println("failed");
            break;
        }

        Laptop lap = Laptop.Macbook;
        System.out.println(lap + " "+lap.getPrice());

        for (Laptop lapi : Laptop.values()){
            System.out.println(lapi + " "+lapi.getPrice());
        }
    }
}
