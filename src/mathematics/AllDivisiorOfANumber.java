package mathematics;

import java.util.Scanner;

public class AllDivisiorOfANumber {
    // naive solution
    public static void findFactor(int num) {
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                System.out.print(i + "  ");
            }
        }
    }

    // efficient solution
    public static void findFactor2(int num) {

        int i;
        for (i = 1; i * i <= num; i++) {
            if (num % i == 0) {
                System.out.print(i + "  ");
                if (i != (num / i)) {
                    System.out.print((num / i) + "  ");
                }
            }
        }
        // for (; i >= 1; i--) {
        // System.out.print((num / i) + " ");
        // }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a no. to find its all factors :");
        int a = s.nextInt();
        s.close();

        System.out.println("");
        System.out.println("Using naive solution : Factors are :");
        findFactor(a);

        System.out.println("");
        System.out.println("");
        
        System.out.println("Using efficient solution : Factors are :");
        findFactor2(a);
    }
}
