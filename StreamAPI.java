import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class StreamAPI {
    public static void main(String[] args) {
        List<Integer> nums= Arrays.asList(4,5,6,7,8,9,0);

        // Stream<Integer> s1=nums.stream();

        // Stream<Integer> s2=s1.filter(n->n%2==0);

        // Stream<Integer> s3=s2.map(n->n*2);

        // int res =s3.reduce(0,(c,e)->c+e);
        // System.out.println(res);

        // s3.forEach(n->System.out.println(n));

        int res=nums.stream()
        .filter(n->n%2==0)
        .map(n->n*2)
        .reduce(0,(c,e)->c+e);//carry,element
        System.out.println(res);

        Stream<Integer> st1=nums.parallelStream()
        .filter(n->n%2==0);

        Predicate<Integer> pr = new Predicate<Integer>() {
            @Override
            public boolean test(Integer t) {
                return t%2==0;
            }
        };
        Stream<Integer> st=nums.stream()
        .filter(pr)
        .sorted();
        st.forEach(n->System.out.println(n));
    }
}
