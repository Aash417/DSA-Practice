package mathematics;

import java.util.Scanner;

public class PrimeFactor extends PrimeNo {
    // naive method
    public static void primeFactor(int num) {
        for (int i = 2; i < num; i++) {
            if (isPrime3(i)) {

                int temp = i;

                while (num % temp == 0) {
                    System.out.print(i + "  ");
                    temp *= i;
                }
            }
        }
    }

    // efficient solution
    public static void primeFactor2(int num) {
        if (num <= 1) {
            return;
        }
        for (int i = 2; i * i <= num; i++) {
            while (num % i == 0) {
                System.out.print(i + "  ");
                num /= i;
            }
        }
        if (num > 1) {
            System.out.println(num);
        }
    }

    // little bit optimized efficient solution
    public static void primeFactor3(int num) {
        if (num <= 1) {
            return;
        }
        while (num % 2 == 0) {
            System.out.print("2  ");
            num /= 2;
        }
        while (num % 3 == 0) {
            System.out.print("3  ");
            num /= 3;
        }
        for (int i = 5; i * i <= num; i= i+6) {
            // for ith term
            while (num % i == 0) {
                System.out.print(i + "  ");
                num /= i;
            }
            // for (i+2)th term
            while (num % (i+2) == 0) {
                System.out.print((i+2) + "  ");
                num /= (i+2);
            }
        }
        if (num > 1) {
            System.out.println(num);
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a no. to find its prime factor :");
        int a = s.nextInt();
        s.close();

        System.out.println("");
        System.out.println("Using naive solution : Prime factor are : ");
        primeFactor(a);

        System.out.println("");
        System.out.println("Using efficient solution : Prime factor are : ");
        primeFactor2(a);

        System.out.println("");  
        System.out.println("Using more efficient solution : Prime factor are : ");
        primeFactor3(a);
        System.out.println("");

    }
}
