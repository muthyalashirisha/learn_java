// abstract class Computer{
//     public abstract void code();
// }

// class Laptop extends Computer{
//     public  void code(){
//         System.out.println("code, run and test");
//     }
// }

// class Desktop extends Computer{
//     public  void code(){
//         System.out.println("code, run and test faster");
//     }
// }

interface Computer{
    public void code();
}

class Laptop implements  Computer{
    public  void code(){
        System.out.println("code, run and test");
    }
}

class Desktop implements Computer{
    public  void code(){
        System.out.println("code, run and test faster");
    }
}

class Developer{
    public void developApp(Computer com){
        com.code();
    }
}

public class NeedOfInterfaces {
    public static void main(String[] args) {
        Computer desk =new Desktop();
        Computer lap =new Laptop();
        Developer dev=new Developer();
        dev.developApp(lap);
        dev.developApp(desk);
    }
}
