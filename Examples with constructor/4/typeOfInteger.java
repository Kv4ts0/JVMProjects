import java.util.Arrays;
import java.util.List;

public class typeOfInteger {
    protected int x = 3;
    protected int y = 3;

    public typeOfInteger() {
        System.out.println("Hello My Class");
    }
    void method1() {
        if(x>0){
            System.out.println(4*x-y);
        }
        else if(x == 0){
            System.out.println(4*x+y);
        }
    }
    void method2() {
        if(y>0){
            System.out.println(4*x+y);
        }
        else if(y == 0){
            System.out.println(2*x-y);
        }
    }

}

