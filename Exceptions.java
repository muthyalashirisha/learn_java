
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//errors
//compile time errors
//logical errors
//run time errors: exceptions

// we handle exceptions called exception handling
// statements: Normal statement- ex int i=0
//critical statement: ex int j=18/i ;

//exception hierarchy
//Object
//Throwable
//1. Error ex:i/o error, thread death, out of memory
//2. Exception---RuntimeException, SQLException, IOException
//RuntimeException--ArithematicException, ArrayIndexOutOfBoundException --- unchecked exceptions( can or cnnot handle exception (basically has choice))
//SQL,IO excetions are checked exceptions that means java forces to handle the excetions


//try,catch,throw,throws
//throw is used to throw the exception
//throws to send exception to calling class method i.e., ducking exceptions

//creating own exception class
class MyException extends Exception{
    public MyException(String str){
        super(str);
    }
}
class A {
    public void show() throws ClassNotFoundException{
        Class.forName("Aa");
    }
}

public class Exceptions {
    public static void main(String[] args) throws IOException {
        int i=15;
        int j=0;
        int k=0;
        int nums[]=new int[5];
        String str=null;
        try {
            j=14/i;
            // if (j==0){
            //     throw new ArithmeticException("An error j==0 leads to division by zero");
            // }
            if (j==0){
                throw new MyException("An error j==0 leads to division by zero");
            }
            k=3/j;
            System.out.println(str.length());
            System.out.println(nums[5]);
        } catch (ArithmeticException e) {
            // System.out.println("something went wrong: divide by zero");
            System.out.println("something went wrong: "+e);
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("something went wrong: array index");
        } catch (MyException e){
            System.out.println("something went wrong "+e);
        } catch (Exception e){
            System.out.println("something went wrong:"+e);
        }
        System.out.println(i);
        System.out.println(j);

        try {
            Class.forName("Exceptions");
        } catch (Exception e) {
            System.out.println("something went wrong:"+e);
        }

        A obj=new A();
        try {
            
            obj.show();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        //finally
        //irrespective of exception things written in finally gets executed  
        //genarally meant to close resources
        try {
            j=18/0;
            System.out.println(j);
        } catch (Exception e) {
            System.out.println("something went wrong");
        }finally{
            System.out.println("Bye");
        }

        BufferedReader br=null;
        try {
            br=new BufferedReader(new InputStreamReader(System.in));
            int num= Integer.parseInt(br.readLine());
            System.out.println(num);
        } finally{
            br.close();
        }

        //without final once try gets over resource gets closed automatically
        //try with resources
        try(BufferedReader br1=new BufferedReader(new InputStreamReader(System.in))) {
            int num= Integer.parseInt(br1.readLine());
            System.out.println(num);
        }
    }
}
