package arrays;

public class LeftRotateByD extends LeftRotateAnArray {
    public static void main(String[] args) {

        // original arraay is rotating all the time if want to check any one part of
        // code then comment the otheres in main

        int[] arr = { 10, 20, 30, 40, 50, 60, 70 };
        System.out.println("");
        System.out.println("");
        System.out.print("original one :  ");
        for (int i : arr) {
            System.out.print(i + "  ");
        }

        System.out.println("");
        System.out.println("");
        int[] tempNewArr = lRotateByD(arr, 2);
        System.out.print("using naive method : ");
        for (int i : tempNewArr) {
        System.out.print(i + "  ");
        }

        System.out.println("");
        System.out.println("");
        int[] tempNewArr2 = lRotateByD2(arr, 1);
        System.out.print("using better method : ");
        for (int i : tempNewArr2) {
            System.out.print(i + "  ");
        }

        System.out.println("");
        System.out.println("");
        System.out.print("using efficient method : ");
        int[] tempNewArr3 = lRotateByD3(arr, 1);
        for (int i : tempNewArr3) {
            System.out.print(i + "  ");
        }
       
        System.out.println("");
        System.out.print("original one :  ");
        for (int i : arr) {
            System.out.print(i + "  ");
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
    public static int[] lRotateByD3(int arr[], int d) {

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

    // better method
    public static int[] lRotateByD2(int arr[], int d) {

        int temp[] = new int[d];
        // coping elements to new temp aarr
        for (int i = 0; i < d; i++) {
            temp[i] = arr[i];
        }
        // copying elements to new indexs
        for (int i = d; i < arr.length; i++) {
            arr[i - d] = arr[i];
        }
        int n = arr.length;
        for (int i = 0; i < d; i++) {
            arr[n - d - i] = temp[i];
        }
        return arr;

    }
}
