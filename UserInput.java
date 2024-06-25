
import java.io.IOException;
import java.util.Scanner;


public class UserInput {
    public static void main(String[] args)throws IOException {
        // int num= System.in.read();//it gets ascii value and reads one char at a time
        
        //buffered reader
        //can take input from any where like console,file etc
        // InputStreamReader in=new InputStreamReader(System.in);
        // BufferedReader bf = new BufferedReader(in);
        // int num = Integer.parseInt(bf.readLine());
        // System.out.println(num);
        // bf.close();

        //scanner class
        Scanner scan = new Scanner(System.in);
        int num1 = scan.nextInt();
        System.out.println(num1);
        scan.close();
    }    
}
