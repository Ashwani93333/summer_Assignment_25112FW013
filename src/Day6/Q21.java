/*Write a program to Convert decimal to binary.*/
package Day6;

import java.util.Scanner;

public class Q21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int binary = 0;
        int place = 1;

        while (n > 0) {
            int rem = n % 2;
            binary = binary + rem * place;
            place *= 10;
            n /= 2;
        }

        System.out.println(binary);
    }
}
