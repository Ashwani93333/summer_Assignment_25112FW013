/*Write a program to Check strong number.*/

package Day5;

import java.util.Scanner;

public class Q18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n =  sc.nextInt();

        //calling method
        if (checkStrong(n)){
            System.out.println("Strong Number");
        }else {
            System.out.println("Not Strong Number");
        }
    }

    //method to check Strong number
    // Strong num is those are the sum of factorial of each digits of num == num itself
    static boolean checkStrong(int n){
        int num = n;
        int factSum = 0;
        int fact;
        int rem;

        while (num != 0) {
            fact = 1;
            rem = num % 10;

            //factorial of each digit
            for (int i = 1; i <=rem ; i++) {
                fact *= i;

            }
            factSum += fact;
            num = num / 10;
        }

        //check strong condition
        return factSum == n;
    }
}
