package mathematics;

import java.util.Scanner;

public class TailingZero {
    // naive method
    public static int countZero(int num) {
        int factorial = 1;
        for (int i = 2; i <= num; i++) {
            factorial = factorial * i;
        }
        int result = 0;
        while (factorial % 10 == 0) {
            result++;
            factorial = factorial / 10;
        }
        return result;
    }

    // Better method
    public static int countZero2(int num) {
        int result = 0;
        for (int i = 5; i <= num; i = i * 5) {
            result = result + num / i;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the no. to find the tailing zero's in its Factorial :");
        int number = s.nextInt();
        s.close();

        System.out.println("");
        System.out.println("Using Naive method : tailing zeros in the factorial of no. is " + countZero(number));

        System.out.println("");
        System.out.println("Using Better method : tailing zeros in the factorial of no. is " + countZero2(number));
        System.out.println("");
    }
}
