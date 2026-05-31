package Day4;

import java.util.Scanner;

/* Write a program to generate Fibonacci series */
public class Q13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the nth term of Fibonacci Series : ");
        int n =  sc.nextInt();

        //calling method
        fibonacciSeries(n);

    }

    //Method to find fibonacci series till n term
    static void fibonacciSeries(int n){
        int a = 0;
        int b = 1;
        int c;

        //Print initial part of series--> where var c is variable = a+b
        System.out.print(a+" "+b+" ");

        //loop for further
        for (int i = 0; i < n-2; i++) {
            c = a + b;
            System.out.print(c+" ");

            //swap values
            a = b;
            b = c;
        }
    }
}
