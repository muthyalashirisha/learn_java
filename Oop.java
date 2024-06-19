//object oriented programming
//object has properties and behavior
//method overloading: same name with different parameter(no of parameters or type of parameters)
public class Oop {
    public static void main(Strings[] args) {
        int num1=1;
        int num2=2;
        //calc is reference variable 
        Calculator calc=new Calculator();
        int res=calc.Add(num1,num2);
        double res2=calc.Add(3.6,num2);
        int res3=calc.Add(num1,num2,5);
        System.out.println(res);
        System.out.println(res2);
        System.out.println(res3);
        System.out.println(calc.a);
    }
}

class Calculator{
    //instance variable
    int a;
    public int Add(int a,int b){
        //a,b are local variable
        System.out.println("in class calc");
        return a+b;
    }
    public double  Add(double  a,int b){
        System.out.println("in class calc double");
        return a+b;
    }
    public int Add(int a,int b,int c){
        System.out.println("in class calc with three paramters");
        return a+b+c;
    }
}

//Stack and Heap Memory
//all local variables are stored in stack
//each method has its own stack
//for ex: main has its own stack and Add method has its own stack where local variables along with value are stored
// In main we have num1:1, num2:1, calc:address_of_heap_memo, res:value,res2:value, res3:value
// similarly when Add method is called a stack is created for it where its local variables are stored
// when an reference variable is created it creates a **new object** in heap with instance variables and method declarations(actual method will be in stack) and this memo addr stored in stack(i.e., there is a link from stack to heap)