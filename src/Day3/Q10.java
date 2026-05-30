package Day3;

/* Write a Program to print prime numbers in  a range. */

import java.util.Scanner;

public class Q10 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter start of Range: ");
        int start = sc.nextInt();
        System.out.print("Enter end of Range: ");
        int end = sc.nextInt();

        checkPrimeInRange(start, end);
    }

    static  void checkPrimeInRange(int start,int end){


        for (int num = start; num <= end; num++) {

            if (num <= 1) {
                continue;
            }

            boolean isPrime = true;

            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                System.out.print(num + " ");
            }
    }
    }
}
