import java.util.Scanner;
public class ClassC{
    Scanner input = new Scanner(System.in);
    protected int a = input.nextInt();
    protected int b = input.nextInt();
    protected int c = input.nextInt();


    public int lastDig() {
        int lastdig = a%10;
        System.out.println("Last digit of the number \n" + lastdig);
    return lastdig;

    }

    public int firstDig() {
        while (b >= 10)
            b /= 10;
            System.out.println("First digit of the number \n" + b);
    return b;

    }
    void  sumDig() {
        int sum = 0;
        while (c > 0){
            sum = sum + c%10;
            c = c / 10;
        }
        System.out.println( "Sum of the digits of third number \n " + sum);

    }
    void mult(){
        System.out.println("sum of the first and the second \n" + (firstDig() + lastDig()));

    }
}

