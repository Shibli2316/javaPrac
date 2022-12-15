package Random.Assignment1;

import java.util.Scanner;

public class MultiplyMatrices {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number of rows for the first matrix: ");
        int row1 = in.nextInt();
        System.out.print("Enter the number of columns for the first matrix: ");
        int column1 = in.nextInt();
        int[][] matrix1 = new int[row1][column1];
        System.out.print("Enter the number of rows for the second matrix: ");
        int row2 = in.nextInt();
        System.out.print("Enter the number of columns for the second matrix: ");
        int column2 = in.nextInt();
        int[][] matrix2 = new int[row2][column2];
        int[][] matrixResult = new int[column1][row2];
        System.out.println("Populate first matrix");
        for (int i = 0; i<row1; i++){
            for (int j = 0; j<column1; j++){
                System.out.print("Enter the value for " + (i+1) + " row and " + (j+1) + " column: ");
                matrix1[i][j] = in.nextInt();
            }
        }
        System.out.println("First matrix is: ");
        for (int i = 0; i<row1; i++){
            for (int j = 0; j<column1; j++){
                System.out.print(matrix1[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Populate second matrix");
        for (int i = 0; i<row2; i++){
            for (int j = 0; j<column2; j++){
                System.out.print("Enter the value for " + (i+1) + " row and " + (j+1) + " column: ");
                matrix2[i][j] = in.nextInt();
            }
        }
        System.out.println("Second matrix is: ");
        for (int i = 0; i<row2; i++){
            for (int j = 0; j<column2; j++){
                System.out.print(matrix2[i][j] + " ");
            }
            System.out.println();
        }
        if (column1!=row2){
            System.out.println("Since the number of columns of the first matrix is not equal to the number of rows of the second matrix, multiplication between the two is not possible");
        }
        else {
            for (int x = 0; x<row1; x++){
                for (int y = 0; y<column2; y++){
                    for (int z = 0; z<column1; z++){
                        matrixResult[x][y] += (matrix1[x][z] * matrix2[z][y]);
                    }
                }
            }
            System.out.println("Resultant matrix is: ");
                for (int i = 0; i<column1; i++){
                    for (int j = 0; j<row2; j++){
                        System.out.print(matrixResult[i][j] + " ");
                    }
                    System.out.println();
                }
        }
    }
}
