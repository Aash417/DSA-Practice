package arrays;

public class LeftRotateByD extends LeftRotateAnArray {
    public static void main(String[] args) {

        int[] arr = { 10, 20, 30, 40, 50 };
        System.out.println("");
        int[] narr = lRotateByD(arr, 2);
        System.out.println("using naive method : ");

        for (int i : narr) {
            System.out.println(i);
        }

        System.out.println("using efficient method : ");
        int[] newa = lRotateByD2(arr, 2);
        for (int i : newa) {
            System.out.println(i);
        }

    }

    // naive
    public static int[] lRotateByD(int arr[], int d) {

        for (int i = 0; i < d; i++) {
            lRotate(arr);
        }
        return arr;
    }

    // efficient
    public static int[] lRotateByD2(int arr[], int d) {

        int n = arr.length;
        rev(arr, 0, d - 1);
        rev(arr, d, n - 1);
        rev(arr, 0, n - 1);

        return arr;
    }

    public static void rev(int arr[], int low, int high) {
        while (low < high) {
            int temp = arr[low];
            arr[low] = arr[high];
            arr[high] = temp;

            low++;
            high--;
        }
    }
}
