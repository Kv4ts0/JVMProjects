import java.util.Arrays;
import java.util.List;

public class typeOfInteger {
    protected int a;
    protected int b = 30;
    protected int x = 50;

    public typeOfInteger() {

    }
    public typeOfInteger(int a, int b) {
        this.a = a;//initialize
        this.b = b;
    }
    void method1(){

        Integer[] myArray = new Integer[]{a,b};

        List<Integer> list = Arrays.asList(myArray);

        if(a < b){
            System.out.println("Array has interval between a and b");
        }
        else
            System.out.println("Array has no interval between a and b");

    }
    void method2(){
        if(x > a && a < b){
            System.out.println("A is between of " + a + " and " + b);
        }
        else
            System.out.println("A is not between of" + a + " and " + b);
    }

}

