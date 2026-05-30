package Day3;

/* Write a Program to find GCD of two numbers */

import java.util.Scanner;

public class Q11 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        //calling Method
        int gcd = findGcd(a,b);
        System.out.println("GCD is " + gcd);
    }

    static int findGcd(int a, int b){
        int num1 = a;
        int num2 = b;

        // Find GCD using Euclidean Algorithm
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }


        return a;

        // Find LCM
//        int lcm = (num1 * num2) / gcd;
//
//        System.out.println("GCD = " + gcd);
//        System.out.println("LCM = " + lcm);
    }
}
