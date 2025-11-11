package week2.day1;
import java.util.Scanner;
public class IsPrimeNumber {
  public static void main(String[] args) {
	 
	  Scanner scanner = new Scanner(System.in);

      System.out.print("Enter a number: ");
      int n = scanner.nextInt();

      boolean isPrime = true; // assume number is prime

      // Check divisibility from 2 to n-1
      for (int i = 2; i < n; i++) {
          if (n % i == 0) { // if divisible
              isPrime = false;
              break;
          }
      }

      // Print result
      if (isPrime && n > 1) {
          System.out.println(n + " is a Prime number.");
      } else {
          System.out.println(n + " is NOT a Prime number.");
      }

      scanner.close();
  }
}

