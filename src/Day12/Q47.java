package Day12;

import java.util.Scanner;

//Write a program to Write function for
//Fibonacci.
public class Q47 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of terms: ");
        int n = sc.nextInt();

        fibonacci(n);

        sc.close();
    }
    static void fibonacci(int n) {
        int a = 0, b = 1;

        for (int i = 1; i <= n; i++) {
            System.out.print(a + " ");

            int c = a + b;
            a = b;
            b = c;
        }
    }
}
