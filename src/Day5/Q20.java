/*Write a program to Find largest prime factor. */

package Day5;

import java.util.Scanner;

public class Q20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n = sc.nextInt();

        int largest = 0;

        for (int i = 2; i <= n; i++) {
            if (n % i == 0) { // i is a factor of n {Factor condition true}

                int count = 0;

                // Check if i is prime {2nd condition}
                for (int j = 1; j <= i; j++) {
                    if (i % j == 0) {
                        count++;
                    }
                }

                if (count == 2) { // i is prime
                    largest = i;
                }
            }
        }

        System.out.println("Largest Prime Factor = " + largest);
    }

}

