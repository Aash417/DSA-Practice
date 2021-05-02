package mathematics;

import java.util.Scanner;

public class LCM {
    // naive approach
    public static int lcm(int a, int b) {
        int result = Math.max(a, b);
        while (true) {
            if ((result % a == 0) && (result % b == 0)) {
                return result;
            }
            result++;
        }

    }

    // Efficient solution
    public static int gcd3(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return gcd3(b, a % b);
        }
    }

    public static int lcm2(int a, int b) {
        return (a * b) / gcd3(a, b);
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter two no. to find their LCM :");
        int x = s.nextInt();
        // System.out.println("");
        int y = s.nextInt();
        s.close();

        System.out.println("");
        System.out.println("Using naive approach : LCM of both no. is " + lcm(x, y));

        System.out.println("");
        System.out.println("Using better approach : LCM of both no. is " + lcm2(x, y));
        System.out.println("");
    }
}
