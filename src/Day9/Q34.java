/*Write a program to Print reverse number triangle */
package Day9;

import java.util.Scanner;

public class Q34 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n for the pattern");
        int n = sc.nextInt();
        //calling function
        revNumPattern(n);
    }

    static void revNumPattern(int n){

        //logic
        for (int i = n; i>0; i--) {
            for (int j = 1; j <=i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
