/*Write a program to Convert binary to decimal. TCS, Infosys, Wipro*/
package Day6;

import java.util.Scanner;

public class Q22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int binary = sc.nextInt();
        int decimal = 0;
        int power = 0;

        while (binary > 0) {
            int digit = binary % 10;

            decimal += digit * (int)Math.pow(2, power);

            power++;
            binary /= 10;
        }

        System.out.println(decimal);
    }
}
