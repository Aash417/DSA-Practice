package mathematics;

import java.util.Scanner;
// import java.lang.Math;

public class CountDigit {

    // itterative
    public static int countDigit(int number) {
        int count = 0;
        while (number > 0) {
            number = number / 10;
            count++;
        }
        return count;
    }

    // recursive
    public static int countDigit2(int number) {
        if (number == 0) {
            return 0;
        }
        return 1 + countDigit2(number / 10);
    }

    // direct solution
    // public static double countDigit3(int number) {
    // return Math.floor(Math.log(number) + 1);
    // }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number to count the digits in it : ");
        int num = s.nextInt();
        s.close();
        int count = countDigit(num);
        int count2 = countDigit2(num);
        // double count3 = countDigit3(num);

        System.out.println("");
        System.out.println("Using itteration :Number of digits in " + num + " is " + count);

        System.out.println("");
        System.out.println("Using Recursion :Number of digits in " + num + " is " + count2);
        System.out.println("");
        // System.out.println("Using Recursion :Number of digits in " + num + " is " +
        // count3);
    }

}
