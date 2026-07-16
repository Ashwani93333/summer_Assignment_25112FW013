package Day19;

//Q74 Write a program to Subtract matrices. TCS, Infosys, Wipro

import java.util.Scanner;

public class Q74 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter row for Matrix1 :");
        int row1 = sc.nextInt();
        System.out.println("Enter column for Matrix1 :");
        int col1 = sc.nextInt();
        System.out.println("Enter row for Matrix2 :");
        int row2 = sc.nextInt();
        System.out.println("Enter column for Matrix2 :");
        int col2 = sc.nextInt();

        //Dimensions should be same
        if(!(row1 == row2 && col1 == col2)){
            System.out.println("Both  Matrix1 & Matrix2 should be exact Dimensions");
        }else{
            //User input matrix
            int [][] matrix1 = new int [row1][col1];
            int [][] matrix2 = new int [row2][col2];

            // Our subsMatrix
            int[][] subsMatrix = new int[row2][col2];
            int indexSum = 0;

            //input matrix1
            System.out.println("Enter elements for Matrix1 :");
            for (int i = 0; i < row1; i++) {
                for (int j = 0; j < col1; j++) {
                    matrix1[i][j] = sc.nextInt();
                }
                System.out.println();
            }

            //input matrix2
            System.out.println("Enter elements for Matrix1 :");
            for (int i = 0; i < row2; i++) {
                for (int j = 0; j < col2; j++) {
                    matrix2[i][j] = sc.nextInt();
                }
                System.out.println();
            }

            //core logic for addition
            for (int i = 0; i < row1; i++) {
                for (int j = 0; j < col1; j++) {
                    subsMatrix[i][j] = matrix1[i][j] - matrix2[i][j];
                }
            }

            //print subsMatrix
            for (int i = 0; i < row1; i++) {
                for (int j = 0; j < col1; j++) {
                    System.out.print(subsMatrix[i][j] + " ");
                }
                System.out.println();
            }
        }
    }
}
