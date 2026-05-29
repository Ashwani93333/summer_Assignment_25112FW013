package Day2;

/* Write a program to find sum of digits of a number */

public class Q5 {
    public static void main(String[] args) {
        int num = 1236;
        int answer  = sumOfDigits(num);
        System.out.println(answer);
    }

   static int sumOfDigits(int num) {
        int sum = 0;
        int r = 0;
        while (num != 0) {
            r = num%10;
            sum = sum + r;
            num = num/10;
        }
        return sum;
    }
}
