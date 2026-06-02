/*Write a program to Count set bits in a number.*/
package Day6;

import java.util.Scanner;

public class Q23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int count = 0;

        while (n > 0) {
            if (n % 2 == 1) {
                count++;
            }
            n /= 2;
        }

        System.out.println(count);
    }
}
