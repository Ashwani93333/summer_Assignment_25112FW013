package Day2;

import java.util.Scanner;

/*Write a Program to check whether a number is palindrome.*/
public class Q8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int rev = reverse(num);

        if (rev == num) {
            System.out.println("Yes !! Palindrome");
        }else{
            System.out.println("No !! Not Palindrome");
        }
    }

    //Method to Reverse a Number
    static int reverse(int x) {
        int num = x;

        int revNum = 0;
        int reminder;

        while (num != 0) {
            reminder = x % 10;
            revNum = revNum * 10 + reminder;
            num =  num / 10;
        }

        return revNum;
    }
}
