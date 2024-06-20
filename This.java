//this refers to current class object
//when we have same instance and local variable
class Human{
    private String name;
    private int age;

    public String getName() {
        return name;
    }
    // public void setName(String name) {
    //     this.name = name;
    // }
    public void setName(String name,Human obj) {
        //name is instance variable and local variable of setName so if we just do as below
        //name=name arise ambiguity so java considers both of them as local variables
        //a solution to this is to pass obj as parameter like above ex obj.name=name
        //but any how we are call setname using obj (ex ojb.setName) and passing obj as parameter also which not look efficient 
        //so java provides a keyword called **this** which refer to current class obj ex this.name=name
        obj.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
}

public class This {
    public static void main(String[] args) {
        Human h=new Human();
        h.setName("shirisha",h);
        // h.setName("shirisha");
        h.setAge(24);
        System.out.println(h.getAge());
        System.out.println(h.getName());
    }
}