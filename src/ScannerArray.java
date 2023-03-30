import java.util.Scanner;
public class ScannerArray {
    public static void main(String[] args) {
        Scanner reader = new Scanner (System.in);
        int[] numbers = new int[5]; // declaring an array of size 5

        System.out.println("Enter 5 numbers:"); // asking for the user to enter 5 numbers for the array

        for ( int i = 0; i < numbers.length; i++ ) {
            numbers[i] = reader.nextInt(); // assigns the user input to the index in the array
        }
 int sum = 0;
        for ( int i = 0 ; i < numbers.length; i++ ){
            sum += numbers[i];
        }
// 'i' acts as the index, and the for loop adds each number from the array together and stores it into the 'sum' variable
        System.out.println("The sum of the numbers you have provided is: " + sum);

        double average = (double) sum / numbers.length;

        System.out.println("The average value of the numbers you have provided is: " + average);
    }

}
