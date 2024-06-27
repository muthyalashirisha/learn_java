//B,C should be final or sealed or non-sealed
sealed class A extends Thread permits B,C{

}
final class B extends A{

}
non-sealed  class C extends A{

}
class D extends C{

}
sealed interface X permits Y{

}
non-sealed interface Y extends X{

}
public class SealedClasses {
    public static void main(String[] args) {
        
    }
}
