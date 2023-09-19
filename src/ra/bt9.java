package ra;

import java.util.Scanner;

public class bt9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {1, 2, 4, 7, 4, 9};
        int max = arr[0];
        int max2 = 0;
        for (int j : arr) {
            if (j > max) {
                max2 = max;
                max = j;
            }
        }
        System.out.println("Phần tử lớn thứ hai trong mảng là: " + max2);
    }
}
