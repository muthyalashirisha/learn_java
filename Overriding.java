//method overrriding
//child class redefining parent class method 
class Calc{
    int add(int a,int b){
        return a+b;
    }
}
class AdvCalc extends Calc{
    @Override
    int add(int a ,int b){
        return a+b+1;
    }
}
public class Overriding {
    public static void main(String[] args) {
        AdvCalc advC=new AdvCalc();
        int res=advC.add(2, 3);
        System.out.println(res);
    }
}
