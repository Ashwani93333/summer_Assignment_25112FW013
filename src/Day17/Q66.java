package Day17;

import java.util.Scanner;

//Write a program to Union of arrays
public class Q66 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int arr1[] = {1, 2, 3, 4};
        int arr2[] = {3, 4, 5, 6};

        System.out.println("Union of Arrays:");

        // Print elements of first array
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + " ");
        }

        // Print only unique elements from second array
        for (int i = 0; i < arr2.length; i++) {
            boolean found = false;

            for (int j = 0; j < arr1.length; j++) {
                if (arr2[i] == arr1[j]) {
                    found = true;
                    break;
                }
            }

            if (!found) {
                System.out.print(arr2[i] + " ");
            }
        }

        sc.close();

    }
}
