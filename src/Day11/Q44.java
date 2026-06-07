//Q44 Write a program to Write function to find
//factorial.
package Day11;

import java.util.Scanner;

public class Q44 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();

        System.out.println("Factorial of "+n+" is "+factorial(n));
    }

    static  int factorial(int n) {
        if (n <= 1) {
            return n;
        }

        return factorial(n - 1) * n;

    }
}
