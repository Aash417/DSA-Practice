package mathematics;

import java.util.Scanner;

public class GCD {
    // naive approach
    public static int gcd(int x, int y) {
        int result = Math.min(x, y);
        while (result > 0) {
            if ((x % result == 0) && (y % result == 0)) {
                break;
            }
            result--;
        }
        return result;
    }
    // Eculidean approach
    public static int gcd2(int x, int y) {
        while (x != y) {
            if (x > y) {
                x = x - y;
            } else {
                y = y - x;
            }
        }
        return x;
    }
// Optimized Eculidean approach
public static int gcd3(int x, int y) {
    if (y == 0) {
        return x;
    } else {
        return gcd3(y, x%y);
    }
}
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter two no. to find their GCD/HCF :");
        int a = s.nextInt();
        // System.out.println("");
        int b = s.nextInt();
        s.close();

        System.out.println("");
        System.out.println("Using naive approach : GCD of " + a + " and " + b + " is " + gcd(a, b));
        
        System.out.println("");
        System.out.println("Using Eculidean approach : GCD of " + a + " and " + b + " is " + gcd2(a, b));
        
        System.out.println("");
        System.out.println("Using optimized Eculidean approach : GCD of " + a + " and " + b + " is " + gcd3(a, b));
        System.out.println("");
    }
}
