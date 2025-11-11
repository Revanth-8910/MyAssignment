
package week2.day1;
import java.util.Scanner;
public class Palindrome {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        // Declare two int variables
        int input, output = 0;

        // Take user input
        System.out.print("Enter a number: ");
        input = scanner.nextInt();

        // Store the original input for later comparison
        int original = input;

        // Reverse the digits using a for loop
        for (int i = input; i > 0; i = i / 10) {
            int rem = i % 10;           // get the last digit
            output = (output * 10) + rem; // build the reversed number
        }

        // Compare input and output to check for palindrome
        if (original == output) {
            System.out.println(original + " -> It is a Palindrome (reads the same forward and backward).");
        } else {
            System.out.println(original + " -> It is NOT a Palindrome.");
        }

        scanner.close();
    }
}
