/*Write a program to Check perfect number*/
package Day5;

import java.util.Scanner;

public class Q17 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n =  sc.nextInt();

        //calling method
        if (checkPerfect(n)){
            System.out.println("Perfect Number");
        }else {
            System.out.println("Not Perfect Number");
        }
    }

    //Method to check n is perfect or not
    // sum of divisor numbers till n to n == n then perfect else not perfect
    static boolean checkPerfect(int n){
        int sum = 0;

        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                sum+=i;
            }
        }

        //check core condition
        return sum == n;
    }
}
