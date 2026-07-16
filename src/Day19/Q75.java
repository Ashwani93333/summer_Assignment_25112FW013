package Day19;

import java.util.Scanner;

//Q75 Write a program to Transpose matrix. TCS, Infosys, Wipro
public class Q75 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter row for Matrix1 :");
        int row1 = sc.nextInt();
        System.out.println("Enter column for Matrix1 :");
        int col1 = sc.nextInt();

        if(row1!=col1){
            System.out.println("For Transpose row and col should be same");
        }else{
            //User input matrix
            int [][] matrix1 = new int [row1][col1];

            //input matrix1
            System.out.println("Enter elements for Matrix1 :");
            for (int i = 0; i < row1; i++) {
                for (int j = 0; j < col1; j++) {
                    matrix1[i][j] = sc.nextInt();
                }
                System.out.println();
            }

            //logic for transpose of matrix

            for (int i = 0; i < row1; i++) {
                // Must catch is start j form --- i+1 ot avoid again swapping
                for (int j = i+1; j < col1; j++) {
                    //swapping the elements
                    int temp = matrix1[i][j];
                    matrix1[i][j] = matrix1[j][i];
                    matrix1[j][i] = temp;
                }
                System.out.println();
            }

            //print Transposed matrix
            for (int i = 0; i < row1; i++) {
                for (int j = 0; j < col1; j++) {
                    System.out.print(matrix1[i][j] + " ");
                }
                System.out.println();
            }
        }
    }
}
