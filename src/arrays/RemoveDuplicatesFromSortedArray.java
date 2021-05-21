package arrays;

public class RemoveDuplicatesFromSortedArray {
    public static void main(String[] args) {

        int ar[] = { 10, 20, 20, 30, 30, 30, 40, 40 };

        int newar[] = removeDuplicates(ar);
        for (int i : newar) {
            System.out.print(i+"  ");
        }
        System.out.println("");
        System.out.print("NO. of element remain in the array : "+removeDuplicates2(ar));

    }

    // naive
    public static int[] removeDuplicates(int arr[]) {

        int n = arr.length;
        int temp[] = new int[n];
        int res = 1;
        temp[0] = arr[0];

        for (int i = 1; i < n; i++) {
            if (temp[res - 1] != arr[i]) {
                temp[res] = arr[i];
                res++;
            }
        }

        return temp;
    }

    // efficient
    // will send no. of elements
    public static int removeDuplicates2(int arr[]) {

        int res = 1;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[res - 1]) {
                arr[res] = arr[i];
                res++;
            }
        }

        return res;
    }
}
