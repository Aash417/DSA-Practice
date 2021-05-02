package mathematics;

import java.util.Scanner;

public class ComputingPower {
    // naive solution
    public static int computePower(int num, int power) {
        int result = 1;
        for (int i = 0; i < power; i++) {
            result = result * num;

        }
        return result;
    }

    // efficient recursive solution
    public static int computePower2(int num, int power) {
        if (power == 0)
            return 1;

        int temp = computePower2(num, power / 2);

        temp = temp * temp;

        if (power % 2 == 0)
            return temp;
        else
            return temp * num;

    }

    // more efficient itterative solution
    public static int computePower3(int num, int power) {
        int result = 1;
        while (power > 0) {
            if (power % 2 != 0) {

                result = result * num;

            }
            num *= num;
            power = power >> 1;

        }
        return result;

    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a no. to find its exponent :");
        int num = s.nextInt();
        System.out.println("Enter its power value :");
        int power = s.nextInt();
        s.close();

        System.out.println("");
        System.out.println("Using naive approach : Value of " + num + " is to the power " + power + " is : "
                + computePower(num, power));
        System.out.println("");

        System.out.println("Using efficient recusive approach : Value of " + num + " is to the power " + power
                + " is : " + computePower2(num, power));
        System.out.println("");

        System.out.println("Using efficient recusive approach : Value of " + num + " is to the power " + power
                + " is : " + computePower3(num, power));

    }

}
