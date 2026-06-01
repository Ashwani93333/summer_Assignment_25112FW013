/*Write a program to Print factors of a number.*/

package Day5;

import java.util.Scanner;

public class Q19 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n=sc.nextInt();

        //calling method
        printFactors(n);

    }

    //method to print factors of number
    //those numbers who completely divide the given num {rem = 0}

    static void printFactors(int n){
        // While loop is not perfect for this problem bcz we knows the how many times will loop runs
//        int i = 1;
//        while (n!=0){
//            if (n%i==0){
//                System.out.print(i+" ");
//            }
//
//            //update
//            i++;
//        }

        for (int i = 1; i <=n ; i++) {
            if (n%i==0) {
                System.out.print(i+" ");
            }
        }
    }
}
