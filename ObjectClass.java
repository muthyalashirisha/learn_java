//every class extends object class by default
//object class toString method
//we can override the methods of object class
//when obj1 is printed it calls obj1.toString() method
//we also have equals, hashcode and other methods in object class 
class Laptop{
    String model;
    int price;

    public String toString() {
        return "Laptop [model=" + model + ", price=" + price + "]";
    }

    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((model == null) ? 0 : model.hashCode());
        result = prime * result + price;
        return result;
    }

    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Laptop other = (Laptop) obj;
        if (model == null) {
            if (other.model != null)
                return false;
        } else if (!model.equals(other.model))
            return false;
        if (price != other.price)
            return false;
        return true;
    }

    
}
public class ObjectClass {
    public static void main(String[] args) {
        Laptop obj1=new Laptop();
        obj1.model="Lenova";
        obj1.price=10000;
        System.out.println(obj1);

        Laptop obj2=new Laptop();
        // obj2.model="Lenova";
        obj2.price=10000;

        System.out.println(obj2.equals(obj1));
        System.out.println(obj1.hashCode());
    }
}
