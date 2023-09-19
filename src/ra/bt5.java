package ra;

public class bt5 {
    public static void main(String[] args) {
        // tim so nho nhat trong mang
        int[] arr = {10,4,5,20,2} ;
        int min = arr[0] ;
        for (int i = 0; i < arr.length ; i++) {
            if (arr[i]<min) {
                min=arr[i] ;
            }
        }
        System.out.println("So nho trong mang la " + min);
    }
}
