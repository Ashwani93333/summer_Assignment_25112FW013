//Q36 Write a program to Print hollow square pattern

package Day9;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class Q36 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n for the pattern");
        int n = sc.nextInt();
        //calling function
        hollowSquare(n);

    }

    static void hollowSquare(int n){
       for (int i = 0; i < n; i++) {
           for (int j = 0; j<n ; j++) {
               if(i==0||j==0 || i==n-1||j==n-1){
                   System.out.print("*");
               }else{
                   System.out.print(" ");
               }
           }
           System.out.println();
       }
    }
}
