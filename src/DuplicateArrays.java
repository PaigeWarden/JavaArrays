import java.util.Random;
public class DuplicateArrays {
    public static void main(String[] args) {
        int[] array1 = new int[10];
        int[] array2 = new int[10];
       for (int i = 0; i < array1.length; i++) {
           Random rand = new Random();  // the random generator
           array1[i] = rand.nextInt(20) + 1;//  gives a random value to each index of the array
           System.out.print(array1[i] +" ");} // print out values in array 1
        for (int j = 0; j < array2.length; j++) {
            Random rand2 = new Random();
            array2[j] = rand2.nextInt(20) + 1;//  gives a random value to each index of the array
            System.out.print(array2[j] + " "); } // printing out the values in array 2
        System.out.print("Duplicates: ");
        boolean[] printed = new boolean[20]; // keep track of printed values
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array2.length; j++) {
                if (array1[i] == array2[j] && !printed[array1[i]-1]) {
                    System.out.print(array1[i] + " ");
                    printed[array1[i]-1] = true; // mark value as printed
                }
            }
        }

    }
}

//Create a new Java program called Duplicates
//
//Create and initialise two integer array (array1 and array2) and pre-fill them with random values between 1 to 20 and print them, each on one line.
//
//Use a pair of nested for loops to find values from array1 that are duplicated in array2 and print them out.
//
//Check the results