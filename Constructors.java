class Human{
    private String name;
    private int age;

    //default constructor
    //same as classname and doesnot return any thing 
    //used to intialize , connect to database
    //called when object is created
    public Human() {
        name="shirisha";
        age=24;
    }
    //parameterized constructor
    public Human(String name,int age) {
        this.name=name;
        this.age=age;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
}

public class Constructors {
    public static void main(String[] args) {
        Human obj1=new Human();
        System.out.println(obj1.getAge());
        System.out.println(obj1.getName());
        Human obj2=new Human("latha",40);
        System.out.println(obj2.getAge());
        System.out.println(obj2.getName());
    }
}
