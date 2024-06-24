//abstract
// abstarct method: a method without defination only declaration 
// A class containing abstract method should be a abstract class
// A abstarct class can have abstarct and non abstract methods
//we cannot create an object of abstarct class
// class extending abstract class must implement abstract methods otherwise we need to make that class also abstract

abstract class Car{
    public abstract void drive();
    public abstract void fly();
    public void playmusic(){
        System.out.println("playmusic()");
    }
}

abstract class WagonR extends Car{
    public void drive() {
        System.out.println("drive()");
    }
}

class UpdatedWagonR extends WagonR{

    public void fly() {
        System.out.println("fly()");
    }
    
}

public class Abstract {
    public static void main(String[] args) {
        Car obj = new UpdatedWagonR();
        obj.fly();
        obj.drive();
    }
}
