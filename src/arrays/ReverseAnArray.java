package arrays;

public class ReverseAnArray {
    public static void main(String[] args) {
        
        int arr[] = { 10, 20, 30, 40, 50 };
        System.out.println("");
        
        for (int i : arr) {
            System.out.print(i+"  "); 
        }

        int newArr[] = reversedA(arr);
        
        System.out.println("Array in reversed : ");
        for (int i : newArr) {
            System.out.println(i+"  ");
        }

    }
    public static int[] reversedA(int arr[]) {
        
        int low = 0, high = arr.length-1;
        
        while (low<high) {
            
            int temp = arr[low];
            arr[low] = arr[high];
            arr[high] = temp;

            low++;
            high--;
        }
        return arr;
    }
}
