package ra;

import javafx.scene.transform.Scale;

import java.util.Scanner;

public class bt7 {
    public static void main(String[] args) {
        // tinh tong cua cac so theo duong cheo cua ma tran
        Scanner sc= new Scanner(System.in) ;
        System.out.println("Nhap vao so hang row = ");
        int row = sc.nextInt();
        System.out.println("Nhap vao so cot col = ");
        int col = sc.nextInt();
        int[][] matrix = new int[row][col] ;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.printf("Nhap vao gia tri cua matrix[%d][%d] ", i, j);
                matrix[i][j]= sc.nextInt();
            }
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.printf("%3d", matrix[i][j]);
            }
            System.out.println();
        }

        // tinh tong cac so theo duong cheo
        int diagonalSum = 0 ;
        for (int i = 0; i < row; i++) {
            diagonalSum += matrix[i][i] ;
        }
        System.out.println("Tong cua cac theo duong cheo = " + diagonalSum);

    }
}
