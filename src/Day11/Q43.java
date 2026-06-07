/*
* Q43 Write a program to Write function to check
prime
* */
package Day11;

import java.util.Scanner;

public class Q43 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number : ");
        int a = sc.nextInt();

        //calling function
        boolean ans  = checkPrime(a);
        if(ans){
            System.out.println("Prime Number");
        }else{
            System.out.println("Not Prime Number");
        }
    }

    static boolean checkPrime(int a){
        boolean isPrime = true;
        if (a <= 1) {
            isPrime = false;
        }
        for(int i=2;i<=Math.sqrt(a);i++){

            if(a%i==0){
                isPrime = false;
                break;
            }
        }
        return isPrime;
    }
}
