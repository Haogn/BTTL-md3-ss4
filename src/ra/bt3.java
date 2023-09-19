package ra;

import java.util.Arrays;

public class bt3 {
    public static void main(String[] args) {
        // gop 2 mang ban dau vao 1 mang
        // khoi tao 2 mang ban dau
        int[] arr1 = {1,2,3,4} ;
        int[] arr2 = {5,6,7,8} ;
        int[] arr3 = new int[arr1.length + arr2.length] ;
        for (int i = 0; i < arr3.length ; i++) {
           if (i < arr1.length) {
               arr3[i] = arr1[i] ;
           } else {
               arr3[i] = arr2[i - arr1.length] ;
           }
        }


        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
        System.out.println("Mang moi sau khi gop 2 mang ban dau "+Arrays.toString(arr3));
    }
}
