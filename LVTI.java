//localvariable type inference
//var key can be used to declare variable but only as local variable
class A{

}
public class LVTI {
    public static void main(String[] args) {
        var a=9;
        int b=9;
        var res=a+b;
        var res1=6;
        int nums[] = new int[10];
        var num1 = new int[10];
        var obj= new A();
    }
}
