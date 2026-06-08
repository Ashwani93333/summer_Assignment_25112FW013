package Day13;

import java.util.Scanner;

//Write a program to Count even and odd
//elements.
public class Q52 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int evenCount = 0;
        int oddCount = 0;

        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 == 0)
                evenCount++;
            else
                oddCount++;
        }

        System.out.println("Number of Even Elements = " + evenCount);
        System.out.println("Number of Odd Elements = " + oddCount);

        sc.close();

    }
}
