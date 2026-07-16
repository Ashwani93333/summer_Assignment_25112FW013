package Day18;

import java.util.Arrays;
import java.util.Scanner;

//Write a program to Sort array in descending
//order.
public class Q72 {
    public static void main(String[] args) {
        System.out.println("Enter Size of array");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        //for taking elements of array
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        //call for sort arr
        decSort(arr);
        System.out.println("Descending Sorted array"+ Arrays.toString(arr));
    }

    static void decSort(int[] arr) {
        if (arr.length == 0) {
            System.out.println("Array is Empty");
        }
        //Bubble sort logic
        //outer loop running len-1 times
        for(int i=0; i<arr.length-1; i++) {
            //inner loop runs len-1-i
            for(int j=0; j<arr.length-1-i; j++){
                if(arr[j] < arr[j+1]) {
                    //swaped the values
                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
}
