package Day2;

/* Write a Program to reverse a Number */

public class Q6 {
    public static void main(String[] args) {

        int num = 1236;
        int answer = reverse(num);

        System.out.println(answer);
    }

    //Method to Reverse a Number
    static int reverse(int x) {

        int revNum = 0;
        int reminder;

        while (x != 0) {
            reminder = x % 10;
            revNum = revNum * 10 + reminder;
            x =  x / 10;
        }

        return revNum;
    }
}
