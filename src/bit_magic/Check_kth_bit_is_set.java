package bit_magic;

public class Check_kth_bit_is_set {
    public static void main(String[] args) {

        int n = 5, k = 1;

        System.out.println("Using left shift : ");
        leftShiftkthBit(n, k);
        System.out.println("Using right shift : ");
        rightShiftkthBit(n, k);
    }

    public static void leftShiftkthBit(int n, int k) {

        if ((n & (1 << (k - 1))) == 1) {
            System.out.println("Set");
        } else {
            System.out.println("No Set");
        }
    }

    public static void rightShiftkthBit(int n, int k) {
        if (((n >> (k - 1)) & 1) == 1) {
            System.out.println("Set");
        } else {
            System.out.println("No Set");
        }
    }
}
