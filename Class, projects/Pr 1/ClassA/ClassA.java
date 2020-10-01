import java.util.Scanner;
public class ClassA{
    Scanner input = new Scanner(System.in);
    protected int a = input.nextInt();
    protected int b = input.nextInt();
    void methodSum() {

        int sum = (a+b);
        System.out.print("Jami " + sum + '\n');
    }
    void methodMult() {
        int mult = (a*b);
        System.out.print("Namravli " +  mult + '\n');
    }
}
