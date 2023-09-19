package ra;

import javafx.scene.transform.Scale;

import java.util.Scanner;

public class bt8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        System.out.println("Nhap vao so hang row =");
        int row = sc.nextInt() ;
        System.out.println("Nhap vao so cot col = ");
        int col = sc.nextInt();
        int [][] matrix = new int[row][col] ;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.printf("\nNhap vao gia tri cua ma tran matri[%d][%d]", i, j);
                matrix[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.printf("%3d", matrix[i][j]);
            }
            System.out.println();
        }
        int count = 0 ;
        System.out.println("Nhap vao gia gia tri can tim kiem ");
        int search = sc.nextInt();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (search == matrix[i][j]) {
                    count++ ;
                }
            }
        }
        System.out.println("So lan xuat hien cua " + search + "trong ma tran la " + count);
    }
}
