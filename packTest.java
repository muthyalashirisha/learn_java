//package name starts with small
//can have inner packages
//import tools.* gets all files not subpackages or folders
// only public methods can be accessed outside class
// package packagename or package packagename.subpkgname;
// import packagename.*; or packagename.filename; or packagename.subpkgname.filename;
//imopt java.lang.*; is there by default no need to explicitly 
import tools.AdvCalc;
import tools.Calc;
public class packTest {
    public static void main(String[] args) {
        AdvCalc c=new AdvCalc();
        Calc cc=new Calc();
        int res2=cc.add(2,3);
        int res=c.multi(2,3);
        System.out.println(res);
        System.out.println(res2);
    }
}
