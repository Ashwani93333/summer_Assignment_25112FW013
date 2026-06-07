//Q41 Write a program to Write function to find sum of two numbers.

package Day11;

import java.util.Scanner;

public class Q41 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number : ");
        int a = sc.nextInt();
        System.out.println("Enter second number : ");
        int b = sc.nextInt();

        //calling function
        int ans = sum(a,b);
        System.out.println(ans);
    }

    static int  sum(int a, int b) {
        return a + b;
    }
}
