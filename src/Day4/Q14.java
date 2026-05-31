package Day4;

/* Write a program to find nth Fibonacci term*/

import java.util.Scanner;

public class Q14 {
    public static void main(String[] args) {
        //10th ka last  34
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the nth term of Fibonacci Series : ");
        int n =  sc.nextInt();

        //calling method
        int nthTerm = fibonacciNthTerm(n);
        System.out.println("nth Term is : "+nthTerm);

    }
    //Method to find fibonacci series till n term
    static int fibonacciNthTerm(int n){
        int x = 0;
        int y = 1;

        //array for storing series
        int []series = new int[n];
        series[0] = x;
        series[1] = y;
        int z;

        //loop for further
        for (int i = 2; i < n ; i++) {
            z = x + y;
            series[i] = z;

            //swap values
            x = y;
            y = z;
        }

        return series[n-1];

    }
}

