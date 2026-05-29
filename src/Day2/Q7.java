package Day2;

/* Write a program to find product of digits */
public class Q7 {
    public static void main(String[] args) {
        int num = 123;
        int answer  = productOfDigits(num);
        System.out.println(answer);

    }

    static int productOfDigits(int num) {
        int product = 1;
        int r = 0;
        while (num != 0) {
            r = num%10;
            product = product*r;
            num = num/10;
        }
        return product;
    }
}
