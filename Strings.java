//string is a class
//here shirisha and sandeep will be stored in heap as it is a reference variable
//heap has special are string constant pool
//by default string is immutable
//to work with immutable string we use string buffer and string builder 
//string buffer is thread safe whereas string builder is not (difference between buffer and builder)
public class Strings {
    public static void main(String[] args) {
        String name="shirisha";
        String name1=new String("sandeep");
        System.out.println(name);
        System.out.println(name1);
        System.out.println(name.charAt(1));
        System.out.println(name.concat(" reddy"));

        //here in heap memo shiri will be stored only once(in string constant pool) and taht addr is stored in stack memo
        String s1="shiri";
        String s2="shiri";
        System.out.println(s1==s2);
        //here old shiri will bot changed but a new object in heap with shirireddy is created and stored in stack and old obj is collected by gc(garbage collector)
        s1=s1+"reddy";
        System.out.println(s1);


        //string buffer
        //string here is mutable
        //gives us buffer size of 16 characters additional because
        //every time we change data if consumes continous memory in heap if heap doenot has memo it has to relocate so to rreduce relocation it gives extra space
        StringBuffer sb=new StringBuffer("shiri");
        System.out.println(sb.capacity());
        System.out.println(sb.length());
        sb.append("reddy");
        sb.delete(0, 1);
        sb.insert(0,"shiri");
        sb.setLength(20);
        System.out.println(sb);

        //assign string buffer to string
        String str=sb.toString();
    }
}
