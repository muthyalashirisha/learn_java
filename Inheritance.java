//child class inherits all the properties of its parent class
// parent , super, base 
// child, subclass, dervied
//extends keyword is used
//is-a relationship (AdvCalc is a Calc)

//types
//single, multi-level
//does not support multiple inheritance

class Calc{
    int add(int a,int b){
        return a+b;
    }
    int sub(int a,int b){
        return a-b;
    }
}
class AdvCalc extends Calc{
    int multi(int a,int b){
        return a*b;
    }
    int div(int a,int b){
        return a/b;
    }
}
class VeryAdvCalc extends AdvCalc{
    double pow(int a,int b){
        return Math.pow(a, b);
    }
}
public class Inheritance {
    public static void main(String[] args) {
        Calc c=new Calc();
        int res=c.add(3, 4);
        System.out.println(res);
        AdvCalc adc=new AdvCalc();
        int res1=adc.add(3, 4);
        int res2=adc.sub(3, 4);
        int res3=adc.multi(3, 4);
        int res4=adc.div(3, 4);
        System.out.println(res1+" "+res2+" "+res3+" "+res4);
        VeryAdvCalc vadc=new VeryAdvCalc();
        int result1=vadc.add(3, 4);
        int result2=vadc.sub(3, 4);
        int result3=vadc.multi(3, 4);
        int result4=vadc.div(3, 4);
        double result5=vadc.pow(3, 4);
        System.out.println(result1+" "+result2+" "+result3+" "+result4+" "+result5);
    }
}
