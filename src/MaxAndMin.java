import java.util.Random;
public class MaxAndMin {
    public static void main(String[] args) {
        int numbers[] = new int[10];
        Random rand = new Random(); // the random generator
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = rand.nextInt(80) + 1;//  gives a random value to each index of the array
            System.out.println(numbers[i]);
        }
        int max = numbers[0]; // declaring index 0 as max
        int min = numbers[0]; // declaring index 0 as min
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) { max = numbers[i]; // looks through the array and replaces the max with the larger int
            }
            if (numbers[i] < min) { min = numbers[i]; // looks through the array and replaces the min with the smaller int
            }
        }
        System.out.println("The minimum value is: " + min);
        System.out.println("The maximum value is: " + max);
        // prints out the max and min
    }


}
