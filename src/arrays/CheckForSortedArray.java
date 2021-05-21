package arrays;

public class CheckForSortedArray {
    public static void main(String[] args) {

        int arr[] = { 10, 20, 30, 40, 50 };
        System.out.println("Using Naive approach : " + isSorted(arr));
        System.out.println("Using efficient approach : "+isSorted2(arr));

    }

    // naive
    public static boolean isSorted(int arr[]) {

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    return false;
                }
            }
        }
        return true;
    }

    // efficient
    public static boolean isSorted2(int arr[]) {

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[i - 1]) {
                return false;
            }
        }
        return true;
    }

}
