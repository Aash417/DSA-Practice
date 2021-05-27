package arrays;

public class LeaderInAnArray {
    public static void main(String[] args) {

        int[] arr= {5,15,6,99,36,54,80,4,31};

        System.out.println("");
        System.out.println("leader's in array are : ");
        isleaders(arr);
        System.out.println("");
        isleaders2(arr);
    }

    // naive
    public static void isleaders(int arr[]) {

        for (int i = 0; i < arr.length; i++) {
            boolean flag = true;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] > arr[i]) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                System.out.print(arr[i]+"  ");
            }
        }
    }
    // effecitive
    public static void isleaders2(int arr[]) {
        int currL = 0;
        int n = arr.length;
        for (int i = n-1; i > 0; i--) {
            if (arr[i] > currL) {
                currL = arr[i];
                System.out.println(currL);
            }
        }
    }
}
