package Day18;

import java.util.Arrays;
import java.util.Scanner;

//Q70 Write a program to Selection sort. Amazon, Deloitte, Capgemini
public class Q70 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);


        System.out.println("Enter the size of the array: ");
        int N = input.nextInt();
        int[] arr = new int[N];
        System.out.println("Enter the elements of the array: ");
        for(int i =0;i<N;i++){
            arr[i] = input.nextInt();
        }

        System.out.println("Actual Array is : "+ Arrays.toString(arr));

        //calling sorting function
        selectionSort(arr);

        //Printing sorted array
        System.out.println("The sorted array is: "+ Arrays.toString(arr));


    }

    static void selectionSort(int[] arr){
        for(int i=0; i<arr.length-1; i++){

            //for supposing mini element take var minimumVal
            int miniVal = i;

            //Inner Loop logic
            for(int j=i+1; j<arr.length;j++){
                if(arr[j]<arr[miniVal]){
                    //update miniVal
                    miniVal = j;
                }

            }

            //Now Swap the actual mini val with current index value
            int temp = arr[i];
            arr[i] = arr[miniVal];
            arr[miniVal] = temp;
        }
    }


}
