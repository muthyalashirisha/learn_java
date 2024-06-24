//final variable 
// makes the variable constant
//allowed only once to intialize

//final method: stops method overriding

//final class : stops class from extending
// final class Calc{
class Calc{
    final public void show(){
        System.out.println("in show()");
    }
    public void add(){
        System.out.println("in add()");
    }
}
class AdvCalc extends Calc{
    // public void show(){
    //     System.out.println("in show() advCalc");
    // }
    public void add(){
        System.out.println("in add() advCalc");
    }
}
public class FinalKey{
    public static void main(String[] args) {
        final int num;
        num=9;
        System.out.println(num);
    }
}