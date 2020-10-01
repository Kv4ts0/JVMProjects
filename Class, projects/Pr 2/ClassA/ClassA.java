import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.Random;
public class ClassA{
    void methodArr() {
        int length = 10;
        Scanner input = new Scanner(System.in);

        String[] numbers = new String[10];
        for(int i = 0; i < length; i++){
            System.out.println("Enter number" + (i+1));
            numbers[i] = input.next();
        }
        input.close();

        for(int i = 0; i < length; i ++){
            System.out.println("Number "+ (i+1) + "\n" + numbers[i]);
        }
    }
    void randomArr() {
        Random randInt = new Random();
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = randInt.nextInt(15);
            System.out.println("Random number " + (i+1) + "\n"  + arr[i]);
        }
    }
    void indexVsValue() {

        int[] my_array = { 5, 4, 6, 1, 3, 2, 7, 8, 9 };
        int length = my_array.length;
        for (int i = 0; i < length; i++) {
            if(my_array[i] < i) {
                int sum = 0;
                sum += my_array[i = i+i];
                System.out.print("Sum of lower values than index:\n" + sum);

            }
        }
        int max = getMax(my_array);
        System.out.println(max);
    }
}

