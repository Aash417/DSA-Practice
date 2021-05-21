package arrays;

public class MoveAllZerosToEnd {
    public static void main(String[] args) {

        int arr[] = { 10, 8, 0, 5, 69, 0, 51, 0 };
        int[] newArr = moveZeros(arr);

        for (int i : newArr) {
            System.out.print(i + " ");
        }

        System.out.println("");
        
        int[] temp= moveZeros2(arr);
        for (int i : temp) {
            System.out.println(i);
        }
    }

    // naive
    public static int[] moveZeros(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[j] != 0) {
                        int temp = arr[i];
                        arr[i] = arr[j];
                        arr[j] = temp;
                    }
                }
            }
        }

        return arr;
    }

    // efficient
    public static int[] moveZeros2(int arr[]) {

        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {

                int temp = arr[i];
                arr[i] = arr[count];
                arr[count] = temp;
                count++;

            }
        }
        return arr;
    }

}
