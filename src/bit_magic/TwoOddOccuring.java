package bit_magic;

public class TwoOddOccuring {
    public static void main(String[] args) {

        int arr[] = { 3, 4, 3, 4, 5, 4, 4, 6, 7, 7 };

        System.out.println("");
        System.out.println("Odd occurance in the array :");
        oddAppering(arr);
    }

    // effcient solution
    public static void oddAppering(int a[]) {

        int XOR = 0, res1 = 0, res2 = 0;

        for (int i = 0; i < a.length; i++) {
            XOR = XOR ^ (XOR - 1);
        }
        int sn = XOR & ~(XOR - 1);
        for (int i = 0; i < a.length; i++) {
            if (((a[i] & sn) != 0)) {
                res1 = res1 ^ a[i];
            } else {
                res2 = res2 ^ a[i];
            }
        }
        System.out.println(res1 + "  " + res2);
    }
}
