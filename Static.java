//static variables
//static variable are shared among all objects created for that class 
//they should accessed using className.variable instead of using reference variable
//in heap a seperate space is allocated to store static variables
//in non static methods we can use static variables
//in simple terms static variable belongs to class not object

//static methods
//non static method cannot be called using classname 
//static methods directly with the help of classname
//a non static variable cannot be called or access directly in static method
//If we pass a reference variable to static method we can use non static variable using reference variable

//static block
//to instantiate atatic variable we generally use static block
//this block is executed only once irrespective how many objects created
//it is called first before creating object
//when a class loads static block gets executed

//when ever an object created
//there are 2 steps
//class loads
//then objects instantiated
//class loads only once
//In jvm we have special area called class loader where all loaded class are present and this happens only once
//if object is not created class will not be loaded 
//but if we want to load a class without creating object we use Class.forname("classname") classname is name of class you want to load
// (static block is executed and if any static variable are present in block get instantiated)

class Phone{
       int cost;
       //static variable
       static String name;
       String brand; 
       static {
        name="smart_phone";
       }

    public Phone() {
        brand="";
        cost=100;
    }
       
       public void show(){
            System.out.println(name+":"+cost+":"+brand);
       }
       //not possible to access name and cost directly in static method
    //    public static void show1(){
    //      System.out.println(name+":"+cost+":"+brand);
    //     }
    public static void show1(Phone p){
        System.out.println(name+":"+p.cost+":"+p.brand);
    }
}
public class Static {
    public static void main(String[] args)throws ClassNotFoundException {
        Phone p1=new Phone();
        p1.cost=100;
        p1.brand="phone1";
        // p1.name="smart_phone";
        Phone.name="smart_phone";
        Phone p2=new Phone();
        p2.cost=200;
        p2.brand="phone2";
        // p2.name="smart_phone";
        p1.show();
        p2.show();

        Phone.show1(p2);

        //used to load the class
        Class.forName("Phone");
    }
}
