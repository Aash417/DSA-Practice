package mathematics;

import java.util.Scanner;

public class Fibonachi {
    // using array
    public static void fibonachi(int n) {

        int arr[] = new int[n + 1];

        arr[0] = 0;
        arr[1] = 1;

        for (int i = 2; i < arr.length; i++) {
            arr[i] = arr[i - 1] + arr[i - 2];
        }

        for (int i = 0; i < arr.length; i++) {

            System.out.print(arr[i]+"  ");

        }
    }

    // using variables
    public static int fibonachi2(int n) {
        if (n == 0 || n == 1)
            return n;

        int a = 0, b = 1;
        for (int i = 0; i < n; i++) {
            int c = a + b;
            a = b;
            b = c;
            System.out.print(c+"  ");
        }
        return 1;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a no. to give range to the fibonachi series :");
        int number = s.nextInt();
        s.close();
        System.out.println("");
        System.out.println("using array :");
        fibonachi(number);
        System.out.println("");

        System.out.println("using variables :");
        fibonachi2(number);
        System.out.println("");

    }

}
