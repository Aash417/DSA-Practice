package arrays;

public class OperationOnArray {

    public static int search(int arr[], int x) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                return i;
            }
        }
        return -1;
    }

    public static int insert(int arr[], int x, int pos) {
        int index = pos - 1, n = arr.length;
        for (int i = n - 1; i >= index; i--) {
            arr[i + 1] = arr[i];
        }
        arr[index] = x;
        return (n + 1);
    }

    public static int delete(int arr[], int d) {
        int i = 0, n = arr.length;
        for (i = 0; i < n; i++) {
            if (arr[i] == d) {
                break;
            }
            if (i == n) {
                return n;
            }
            for (int j = i; j < n-1; j++) {
                arr[j] = arr[j+1];
            }
        }
        return n-1;
    }

    public static void main(String[] args) {

        int arr[] = { 1, 2, 3, 4, 5, 6 };

        System.out.println(search(arr, 6));
 
        // System.out.println(insert(arr, 67, 2));

        System.out.println(delete(arr, 6));
    }
}
