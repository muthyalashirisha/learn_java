
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ForEach {
    public static void main(String[] args) {
        List<Integer> nums= Arrays.asList(4,5,6,7,8,9,0);
        Consumer<Integer> con=new Consumer<Integer>(){
            @Override
            public void accept(Integer n) {
                System.out.println(n);
            }
        };
        nums.forEach(con);

        // Consumer<Integer> con1=(Integer n) ->{
        //         System.out.println(n);
        //     };
        Consumer<Integer> con1= n -> System.out.println(n);
        nums.forEach(con1);

        nums.forEach(n->System.out.println(n));
    }
}
