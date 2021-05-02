package bit_magic;

import java.util.Scanner;

public class PowerOfTwo {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Enter a no. to check if it's the power of two :");
        int n = s.nextInt();
        s.close();

        if (isPow2(n)) {
            System.out.println("Using naive method : Yes it's the power of 2.");
        } else {
            System.out.println("Using naive method : NO it's not the power of 2.");
        }
        
        if (isPow2_Brian(n)) {
            System.out.println("Using efficient method : Yes it's the power of 2.");
        } else {
            System.out.println("Using efficient method : NO it's not the power of 2.");
        }
    }

    // naive method
    public static boolean isPow2(int n) {

        if (n == 0) {
            return false;
        }
        while (n != 1) {
            if (n % 2 != 0) {
                return false;
            }
            n = n / 2;
        }
        return true;
    }

    // efficient solution
    public static boolean isPow2_Brian(int n) {
        if (n == 0) {
            return false;
        }
        return ((n & (n - 1)) == 0);
    }
}
