package Day12;

import java.util.Scanner;

/*
Write a program to Write function for
Armstrong.
*/
public class Q46 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (isArmstrong(n)) {
            System.out.println(n + " is a Armstrong number");
        } else {
            System.out.println(n + " is not a Armstrong number");
        }

    }
    public static boolean isArmstrong(int num) {
        int original = num;
        int digits = String.valueOf(num).length();
        int sum = 0;

        while (num > 0) {
            int digit = num % 10;
            sum += (int) Math.pow(digit, digits);
            num /= 10;
        }

        return sum == original;
    }
}
