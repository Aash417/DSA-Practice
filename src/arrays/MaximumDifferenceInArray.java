package arrays;

public class MaximumDifferenceInArray {
    public static void main(String[] args) {
        int arr[] = { 2, 3, 10, 6, 4, 8, 1 };

        System.out.println("Max diff in array is : ");

        System.out.println(maxDiff(arr));
        System.out.println(maxDiff2(arr));

    }

    // naive1
    public static int maxDiff(int arr[]) {

        int res = arr[1] - arr[0];

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {

                res = Math.max(res, arr[j] - arr[i]);

            }
        }

        return res;
    }
    // efficient
    public static int  maxDiff2(int arr[]) {

        int res = arr[1]-arr[0] , minVal = arr[0];

        for (int i = 1; i < arr.length; i++) {
            
            res = Math.max(res, arr[i]-minVal);
            minVal = Math.min(minVal, arr[i]);

        }
        return res;
    }
}
