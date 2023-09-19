package ra;

import java.sql.SQLOutput;
import java.util.Scanner;

public class bt6 {
    public static void main(String[] args) {
        // cho ng dung nhap vao 1 mang 2 chieu va tinh tong cua 1 cot xac dinh
        Scanner sc = new Scanner(System.in) ;
        System.out.println("Nhap vao so hang row = ");
        int row = sc.nextInt();
        System.out.println("Nhap vao so cot col = ");
        int col = sc.nextInt();
        int [][] matrix = new int[row][col] ;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.printf("\nNhap vao gia tri cua matrix[%d][%d]", i,j);
                matrix[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.printf("%3d", matrix[i][j]);
            }
            System.out.println();
        }
        System.out.println("Nhap vao so cot ban muon tinh tong");
        int sumCol = sc.nextInt() ;
        if (sumCol >= 0 && sumCol < col ) {
            int total = 0 ;
            for (int i = 0; i < row; i++) {
                total += matrix[i][sumCol] ;
            }
            System.out.println("Tong cua cot " + sumCol +" = " + total);
        } else {
            System.out.println("Khong tim thay cot nay trong mang");
        }
    }
}
