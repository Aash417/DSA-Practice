package arrays;

public class LargestElementInArray {
    public static void main(String[] args) {

        int arr[] = { 10, 20, 30, 40, 50 };
        System.out.println("Using Naive approach :" + getLargest(arr));
        System.out.println("Using efficient approach :" + getLargest2(arr));

    }

    public static int getLargest(int arr[]) {

        for (int i = 0; i < arr.length; i++) {
            boolean flag = true;

            for (int j = 0; j < arr.length; j++) {
                if (arr[j] > arr[i]) {
                    flag = false;
                    break;
                }
            }
            if (flag == true) {
                return arr[i];
            }
        }
        return -1;
    }

    public static int getLargest2(int arr[]) {
        int res = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > arr[res]) {

                res = i;

            }
        }
        return arr[res];
    }
}
