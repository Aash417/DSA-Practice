package bit_magic;

import java.util.Scanner;

public class PowerSet {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a string to find its power set :");
        String str = s.nextLine();
        s.close();

        System.out.println("");
        System.out.println("Power set of string is :");
        powerSet(str);

    }

    public static void powerSet(String s) {

        int len = s.length();
        int powerSize = (int) Math.pow(2, len);

        for (int counter = 0; counter < powerSize; counter++) {
            for (int i = 0; i < len; i++) {
                if ((counter & (1<<i)) != 0 ) {
                System.out.println(s.charAt(i));
                }

            }
            System.out.println("");
        }
    }
}
