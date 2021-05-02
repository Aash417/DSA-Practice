package mathematics;

import java.util.Scanner;

public class PrimeNo {
    // naive method
    public static boolean isPrime(int n) {
        if (n == 1) {
            return false;
        }

        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    // efficient method
    // checking between 2 and square root of the no.
    public static boolean isPrime2(int n) {
        if (n == 1) {
            return false;
        }

        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    // ultra efficient method
    public static boolean isPrime3(int n) {
        if (n == 1) {
            return false;
        }
        if (n == 2 || n == 3) {
            return true;
        }
        if (n % 2 == 0 || n % 3 == 0) {
            return false;
        }

        for (int i = 5; i * i <= n; i = i + 6) {
            if (n % i == 0 || n % (i + 2) == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a no. to check if its prime or not :");
        int x = s.nextInt();
        s.close();

        boolean check = isPrime3(x);
        boolean check2 = isPrime2(x);
        boolean check3 = isPrime3(x);

        if (check) {
            System.out.println("Using naive method :Yes , its a prime no. !");
        } else {
            System.out.println("Using naive method :No , its not a prime no. !");
        }
        if (check2) {
            System.out.println("Using efficient method :Yes , its a prime no. !");
        } else {
            System.out.println("Using efficient method :No , its not a prime no. !");
        }
        if (check3) {
            System.out.println("Using super efficient method :Yes , its a prime no. !");
        } else {
            System.out.println("Using super efficient method :No , its not a prime no. !");
        }

    }
}
