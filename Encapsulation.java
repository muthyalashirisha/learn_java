//encapusation is binding data and methods
//data of class is private and not accessible outside the class directly
//methods are used to access data of class here getters and setters are used to get and set private data of human
class Human{
    private String name;
    private int age;

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

public class Encapsulation {
    public static void main(String[] args) {
        Human h=new Human();
        h.setName("shirisha");
        h.setAge(24);
        System.out.println(h.getAge());
        System.out.println(h.getName());
    }
}
