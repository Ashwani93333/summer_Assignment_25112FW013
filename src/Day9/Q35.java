//Q35 Write a program to Print repeated character pattern
package Day9;

import java.util.Scanner;

public class Q35 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n for the pattern");
        int n = sc.nextInt();
        //calling function
        repCharPattern(n);

    }

    static void repCharPattern(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <=i ; j++) {
                System.out.print((char)('A'+i));
            }
            System.out.println();
        }
    }
}
