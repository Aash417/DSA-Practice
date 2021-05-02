package mathematics;

import java.util.Scanner;

public class MultipleOfN {

    public static int findMultiple(int num, int range) {

        int count = 0;
        for (int i = 0; i <= range; i++) {
            if (i * num <= range) {
                System.out.println(i * num);
                count++;
            }
        }
        return count;

    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a no. to find its multiple :");
        int num = s.nextInt();
        System.out.println("Enter its range form 0 to :");
        int range = s.nextInt();
        s.close();

        System.out.println("");
        System.out
                .println("No of multiple " + num + " has between 0 to " + range + " is  : " + findMultiple(num, range));
        System.out.println("");

    }
}
