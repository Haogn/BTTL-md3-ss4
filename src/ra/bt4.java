package ra;

import java.util.Scanner;

public class bt4 {
    public static void main(String[] args) {
        // tim phan tu lon nhat trong mang 2 chieu
        Scanner sc = new Scanner(System.in) ;
        System.out.println("Nhap vao so hang row = ");
        int row = sc.nextInt();
        System.out.println("Nhap vao so cot col = ");
        int col = sc.nextInt();

        int [][] matrix = new int[row][col] ;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.printf("Nhap gia tri cho matrix[%d][%d]", i,j);
                matrix[i][j] = sc.nextInt();
            }
        }
        int max = matrix[0][0] ;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {

                if (matrix[i][j] > max) {
                    max = matrix[i][j] ;
                }

            }
        }
        System.out.println("So lon nhat trong mang 2 chieu la " + max);

    }
}
