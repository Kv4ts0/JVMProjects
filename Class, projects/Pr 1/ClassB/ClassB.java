import java.util.Scanner;
public class ClassB{
    Scanner input = new Scanner(System.in);
    protected int a = input.nextInt();
    protected int b = input.nextInt();
    protected int c = input.nextInt();
    void methodMax() {

        if (a >= b && a>= c)
            System.out.println("Max number is: " + a + '\n');
        else if (b >= a && b>= c)
            System.out.println("Max number is: " + b + '\n');
        else
            System.out.println("Max number is: " + c + '\n');
    }
    void methodMin() {
        if (a <= b && a<= c)
            System.out.println("Min number is: " + a + '\n');
        else if (b <= a && b<= c)
            System.out.println("Min number is: " + b + '\n');
        else
            System.out.println("Min number is: " + c + '\n');
    }
}
