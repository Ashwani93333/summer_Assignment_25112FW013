/*
* Q42 Write a program to Write function to find
maximum.
* */
package Day11;

import java.util.Scanner;

public class Q42 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number : ");
        int a = sc.nextInt();
        System.out.println("Enter second number : ");
        int b = sc.nextInt();

        //calling function
        int ans = maximum(a,b);
        System.out.println(ans);
    }

    static int maximum(int a,int b){
        return a>b?a:b;
    }
}
