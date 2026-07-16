package Day18;

import java.util.Scanner;

//Q71 Write a program to Binary search. Amazon, Deloitte, Capgemini
public class Q71 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array: ");
        for(int i =0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter target Number in Array :");
        int target = sc.nextInt();

        //calling fun
        int ans  = binarySearch(arr, target);

        if(ans<0) System.out.println("Array dose not contain target value");
        else System.out.println("Target "+target+" index is : "+ans);






    }

    static int binarySearch(int [] arr, int target){
        int low = 0;
        int high = arr.length-1;

        //logic
        while(low<high){
            int mid = low + (high - low) / 2;

            if(arr[mid]==target){
                return mid;
            }else if(arr[mid]>target){
                high = mid-1;
            }else{
                low = mid+1;
            }

        }
        return -1;

    }
}
