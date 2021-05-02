package bit_magic;

import java.util.Scanner;

public class Check_Set_Bit {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a no. to count the set bits in it :");
        int n = s.nextInt();
        s.close();

        System.out.println("total set bits are :" + countSet(n));
        System.out.println("Using Brian's algorithm : total set bits are :" + countSet2(n));
    }

    // Naive solution
    public static int countSet(int n) {

        int result = 0;
        while (n > 0) {
            if ((n & 1) == 1) {
                result++;
            }
            n = n / 2;
        }
        return result;
    }

    // efficient solution
    // Brian kerringans Algorithm
    public static int countSet2(int n) {
        int result = 0;
        while (n > 0) {

            n = (n & (n - 1));
            result++;
        }
        return result;
    }

}
