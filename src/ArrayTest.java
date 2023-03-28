public class ArrayTest {

    public static void main(String[] args) {
        int sum = 0;

        int[]numbers = { 5, 9, 8, 15, 20, 11, 7, 13, 10, 3};

        for( int i = 0; i < numbers.length; i++){

            sum = sum + numbers[i];
        }
        System.out.println("The sum of all of the numbers in the array is: " + sum);
        double average = (double)sum / numbers.length;
        System.out.println("The average value of the array is: " + average);
    }
}
