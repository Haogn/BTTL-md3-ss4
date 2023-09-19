package ra;

import java.util.Arrays;
import java.util.Scanner;

public class bt2 {
    public static void main(String[] args) {
        // thêm phần tử vào mảng
        int[] arr = {1,2,3,4,5,6} ;
        Scanner sc = new Scanner(System.in) ;
        System.out.println("Nhập số cần chèn vào mảng");
        int add = sc.nextInt();
        System.out.println("Nhập vị trí index cần thêm vào mảng ");
        int index = sc.nextInt();
        System.out.println("mang ban dau " + Arrays.toString(arr));

        if (index > 0 && index < arr.length) {
            // tao ra 1 mang moi moi co do dai tang len 1
            int[] newArr = new int[arr.length+ 1] ;
            // Sao chép các phần tử từ mảng ban đầu đến vị trí index vào mảng mới
            for (int i = 0; i < index; i++) {
                newArr[i]= arr[i];
            }
            newArr[index] = add;
            for (int i = index + 1; i < newArr.length ; i++) {
                newArr[i] = arr[i-1] ;
            }
            arr = newArr ;
            System.out.println("Mang sau khi them " + add + " la " + Arrays.toString(newArr));
        } else {
            System.out.println("Khong tim thay vi tri can them vao mang");
        }
    }
}
