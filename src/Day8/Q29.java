package Day8;/*Write a program to Print half pyramid pattern.  */

import java.util.Scanner;

public class Q29 {
    public static void main(String[] args) {

        //making object of Scanner class

        Scanner sc = new Scanner(System.in);

        int a = 10;
        System.out.println(sc.getClass().getSimpleName());
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}