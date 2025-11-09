package week1.day2;

public class OddEvenNumbers {
    public static void main(String[] args) {
    	System.out.println("Print the Numbers from 1 to 10:");
    	for (int i=1;i<=10;i++) {
    		System.out.println(i);
    		}
        System.out.println("\nOdd numbers from 1 to 10:");

        // Print all odd numbers first
        for (int i = 1; i <= 10; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }

        System.out.println("\nEven numbers from 1 to 10:");

        // Print all even numbers next
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}