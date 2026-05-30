package Day3;

/* Write a Program to find LCM of two numbers. */

import java.util.Scanner;

public class Q12 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        //calling Method
        int gcd = findLcm(a,b);
        System.out.println("The LCM is " + gcd);


    }
    // find LCM method
    static int findLcm(int a, int b){
        int num1 = a;
        int num2 = b;

        // Find GCD using Euclidean Algorithm
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }


        int gcd = a;

        //find Lcm
        int lcm = (num1 * num2) / gcd;
        return lcm;
    }
}
