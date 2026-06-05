//Q33 Write a program to Print reverse star pattern.
package Day9;

import java.util.Scanner;

public class Q33 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n for the pattern");
        int n = sc.nextInt();
        //calling function
        reverseStar(n);

    }

    static void reverseStar(int n) {
        for (int i = n; i>0; i--) {
            for (int j = 0; j <i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
