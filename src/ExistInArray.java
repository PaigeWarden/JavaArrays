import java.util.Scanner;
public class ExistInArray {

    public static void main(String[] args) {

        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}; // creates an array

        Scanner reader = new
                Scanner(System.in); // adds a scanner so the user can interact
        System.out.println("Enter a number to search the array for");
        // asking the user for a number
        int user = Integer.parseInt(reader.nextLine());
        // checks that what they input is an integer

        boolean found = false;
        for (int i = 0; i < array.length; i++) // checks value against our array
        {
            if (array[i] == user) {
                found = true;
                // checks to see if the value the user inputs is the same as one in the array
                break;
            }
        }

            if (found) {
                System.out.println("Number " + user + " found in array");
                // will output the above message if the user enters a number that is inside of the array
            }
            else {
                System.out.println("Number was not found in array");

                    //is not found, then prints the above
                }
            }
        }


/* Create

Create a new Java program called ExistInArray

Create and initialise

Create and initialise an integer array and pre-fill it with values of your choosing.

Ask

Ask the user to enter an integer value to search for in your array.

Output

If the value exists, output “Value X found in array” otherwise, output “Value was not found in array”. */