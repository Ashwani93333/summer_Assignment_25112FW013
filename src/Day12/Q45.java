package Day12;

import java.util.Scanner;

/*
Write a program to Write function for
palindrome.
*/
public class Q45 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        if (isPalindrome(str)) {
            System.out.println(str + " is a Palindrome");
        } else {
            System.out.println(str + " is not a Palindrome");
        }

    }
    public static boolean isPalindrome(String str) {
        str = str.toLowerCase();

        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }

}
