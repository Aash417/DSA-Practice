package arrays;

public class LeftRotateAnArray {
    public static void main(String[] args) {
        
        int[] arr = {10,20,30,40,50};
        int [] temp = lRotate(arr);
        for (int i : temp) {
            System.out.println(i);
        }

    }
    public static int[] lRotate(int arr[]) {
        
        int temp = arr[0];
        for (int i = 1; i < arr.length; i++) {
            arr[i-1] = arr[i];
        }
        int n = arr.length;
        arr[n-1] = temp;

        return arr;
    }
}
