/*Write a program to Find x^n without pow(). TCS, Infosys, Wipro*/
package Day6;

import java.util.Scanner;

public class Q24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int n = sc.nextInt();

        int result = 1;

        for(int i = 1; i <= n; i++) {
            result *= x;
        }

        System.out.println(result);
    }
}
