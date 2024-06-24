//wrapper class
//for every primitive type we have class
//int Integer
//boolean Boolean
//etc
//wrapper class so many methods
public class Wrapper {
    public static void main(String[] args) {
        int num=7;
        // Integer num1=new Integer(num); // boxing
        Integer num1=num; //autoboxing num is automatically converted to object

        // int num2=num1.intValue();//unboxing
        int num2=num1; //auto-unboxing num1 obj is automatically converting into primitive type
        System.out.println(num1);
        System.out.println(num2);

        String str="12";
        int num3=Integer.parseInt(str);
        System.out.println(num3);
    }
}
