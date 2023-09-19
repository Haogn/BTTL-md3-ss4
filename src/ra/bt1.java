package ra;

import java.util.Arrays;
import java.util.Scanner;

public class bt1 {
    public static void main(String[] args) {
        // tìm và xoá phần tử ra khỏi mảng
        Scanner sc = new Scanner(System.in) ;

        int[] arr = {1,20,33,55,44,88,90} ;

        System.out.println("Nhập vào từ bàn phím phần tử bạn muốn xoá");
        int delete = sc.nextInt();
        int deleteIndex= -1 ;

        System.out.println("mảng ban đầu "+Arrays.toString(arr));
        for (int i = 0; i < arr.length ; i++) {
            int value = arr[i] ;
            if (value==delete) {
                deleteIndex = i ;
                break;
            }
        }

        if (deleteIndex!=-1) {
            for (int i = deleteIndex; i < arr.length -1  ; i++) {
                arr[i]= arr[i+1];
            }
            arr =  Arrays.copyOf(arr, arr.length-1 ) ;
            System.out.println("Mảng sau khi xoá " + delete + " = " + Arrays.toString(arr));
        } else {
            System.out.println("Không tìm thấy phần tử cần xoas trong mảng ");
        }

    }
}
