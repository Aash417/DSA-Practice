package recursion;

public class SubsetSumProblem {
    public static void main(String[] args) {

        int arr[] = { 10, 15, 20 }, sum = 25;
        int n = arr.length;
        System.out.println("");
        System.out.println(countSubset(arr, n, sum));
    }

    public static int countSubset(int arr[], int n, int sum) {
        if (n == 0) {
            if (sum == 0) {
                return 1;
            } else {
                return 0;
            }
        }
        return countSubset(arr, n - 1, sum) + countSubset(arr, n - 1, sum - arr[n - 1]);
    }
}
