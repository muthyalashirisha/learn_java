//jdk->jre->jvm
//every system has inbuilt jvm
//java application is platform independent
//jvm is platform dependent
//when we install jdk we get updated jre and jvm
class Hello{
    public static void main(String args[]){
        double num1=5.6;
        float num2=5.6f;
        long l=18923746l;
        int num3=123;
        boolean val=true;

        System.out.println("hello world");
        System.out.println(num1);
        System.out.println(num2);
        System.out.println(l);

        int binary=0b101;
        int hex=0x101;
        System.out.println(binary);
        System.out.println(hex);

        int a =12;
        byte b=12;
        //explicit is casting
        b=(byte)a;
        //implicit is conversion 
        a=b;
        System.out.println(b);

        float f=5.6f;
        int x=(int)f;
        System.out.println(x);

        int y=140;
        byte z=(byte)y;
        System.out.println(z);

        //type promotion
        byte a1=10;
        byte b1=30;
        int res=a1*b1;
        System.out.println(res);

        //operators
        //conditional statements
        if (9>6)
        System.out.println("true");
        else
        System.out.println("false");

        int r=0;
        r=24%2==0?1:0;
        System.out.println(r);

        switch(2){
            case 1:
        System.out.println("mon");
        break;
        case 2:
        System.out.println("tues");
        break;
        default:
        System.out.println("none");
        }
        
        for (int i=0;i<=4;i++){
            System.out.println("number: "+ (i+5));
        }
        int j=0;
        for (;j<=4;){
            System.out.println("number: "+ (j+5));
            j++;
        }
    }
}