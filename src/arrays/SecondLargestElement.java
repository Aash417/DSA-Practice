package arrays;

public class SecondLargestElement extends LargestElementInArray {

    public static int secondLargest(int arr[]) {

        int largestOne = getLargest2(arr);
        int res = -1;
        for (int i = 0; i < arr.length; i++) {

            if (arr[i] != largestOne) {
                if (res == -1) {
                    res = i;
                } else if (arr[i] > arr[res]) {
                    res = i;
                }
            }
        }
        return arr[res];
    }

    public static int secondLargest2(int arr[]) {

        int res = -1, largest = 0;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] > largest) {
                res = largest;
                largest = i;
            } else if (arr[i] != largest)
                if (res == -1 || arr[i] > res) {
                    res = i;
                }
        }
        return arr[res];
    }

    public static void main(String[] args) {

        int arr[] = { 10, 20, 30, 40, 50 };
        System.out.println("Using Naive approach :" + secondLargest(arr));
        System.out.println("Using efficient approach :" + secondLargest2(arr));

    }
}
