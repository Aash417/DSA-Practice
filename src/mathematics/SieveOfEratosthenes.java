package mathematics;

import java.util.Arrays;
import java.util.Scanner;

public class SieveOfEratosthenes extends PrimeNo {
    // naive approach
    public static void findPrime(int num) {
        for (int i = 2; i <= num; i++) {
            if (isPrime3(i)) {
                System.out.print(i + "  ");
            }
        }
    }

    public static void seiveMethod(int num) {
        if (num <= 1) {
            return;
        }
        boolean isPrime[] = new boolean[num + 1];
        Arrays.fill(isPrime, true);

        // for (int i = 0; i < isPrime.length; i++) {
        // System.out.println(isPrime[i]);
        // }
        // System.out.println("");

        for (int i = 2; i * i <= num; i++) {
            if (isPrime[i]) {
                for (int j = 2 * i; j <= num; j = j + i) {
                    isPrime[j] = false;
                }
            }
        }
        // for (int i = 0; i < isPrime.length; i++) {
        //     System.out.println(isPrime[i]);
        // }
        for (int i = 2; i <= num; i++) {
            if (isPrime[i]) {
                System.out.print(i + "  ");
            }
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a no. to find all the prime no. in between :");
        int a = s.nextInt();
        s.close();
        
        System.out.println("");
        System.out.println("Using naive approach : All the prime no. between 0 and " + a + " are :");
        findPrime(a);

        System.out.println("");
        System.out.println("");
        System.out.println("Using Seive approach : All the prime no. between 0 and " + a + " are :");
        seiveMethod(a);

    }
}
