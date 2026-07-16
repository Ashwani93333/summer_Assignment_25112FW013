package Day19;
//Q76 Write a program to Find diagonal sum. TCS, Infosys, Wipro

import java.util.Scanner;

public class Q76 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter row for Matrix1 :");
        int row1 = sc.nextInt();
        System.out.println("Enter column for Matrix1 :");
        int col1 = sc.nextInt();

        //diagonal sum
        int sum = 0;

        if(row1!=col1){
            System.out.println("For Diagonal row and col should be same");
        }else{
            //User input matrix
            int [][] matrix1 = new int [row1][col1];

            //input matrix1
            System.out.println("Enter elements for Matrix1 :");
            for (int i = 0; i < row1; i++) {
                for (int j = 0; j < col1; j++) {
                    matrix1[i][j] = sc.nextInt();
                }
            }

            //logic for diagonal sum of matrix
            for (int i = 0; i < row1; i++) {
                for (int j = 0; j < col1; j++) {
                   //where i==j this the where diagonal element exist
                    if(i==j){
                        sum+=matrix1[i][j];
                    }
                }
            }

            System.out.println("Diagonal sum is : "+sum);
        }

    }
}
