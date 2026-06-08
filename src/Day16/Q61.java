package Day16;

import java.util.Scanner;

//Write a program to Find missing number in
//array.
public class Q61 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array (n-1): ");
        int size = sc.nextInt();

        int[] arr = new int[size];

        System.out.println("Enter array elements:");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        int n = size + 1;

        int totalSum = n * (n + 1) / 2;
        int arraySum = 0;

        for (int i = 0; i < size; i++) {
            arraySum += arr[i];
        }

        int missing = totalSum - arraySum;

        System.out.println("Missing Number = " + missing);

        sc.close();
    }
}
