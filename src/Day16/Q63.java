package Day16;

import java.util.Scanner;

//Write a program to Find pair with given sum.
public class Q63 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter target sum: ");
        int sum = sc.nextInt();

        boolean found = false;

        System.out.println("Pairs are:");

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] + arr[j] == sum) {
                    System.out.println(arr[i] + " + " + arr[j] + " = " + sum);
                    found = true;
                }
            }
        }

        if (!found) {
            System.out.println("No pair found.");
        }

        sc.close();
    }
}
