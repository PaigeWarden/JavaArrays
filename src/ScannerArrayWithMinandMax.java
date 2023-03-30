import java.util.Arrays;
import java.util.Scanner;
public class ScannerArrayWithMinandMax {
    public static void main(String[] args) {
        Scanner reader = new
                Scanner(System.in);

        int[] numbers = new int[10]; // creates an Array with the value of 10
        System.out.println("Please supply 10 numbers");

        for(int i = 0; i < numbers.length ; i++){
            numbers[i] = reader.nextInt();
// places the users input into the array, each index is replaced by what the user logs

        }
        int min = Arrays.stream(numbers).min().getAsInt(); // finds the minimum value in the array and stores it as an Int
        int max = Arrays.stream(numbers).max().getAsInt(); // finds the maximum value in the array and stores it as an Integer
        System.out.println("The smallest number you provided me with is: " + min); // prints the minimum value
        System.out.println("The biggest number you provided me with is: " + max); // prints the maximum value
    }
}
