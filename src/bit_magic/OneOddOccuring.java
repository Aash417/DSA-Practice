package bit_magic;

public class OneOddOccuring {
    public static void main(String[] args) {
        int arr[] = { 4, 3, 4, 4, 4, 5, 5, 3, 3 };

        System.out.println("");
        System.out.println("");
        System.out.println("Using naive solution :");
        System.out.println(findOddOccurance(arr));
        System.out.println("");
        System.out.println("Using efficient solution :");
        System.out.println(findOddOccurance2(arr));

    }

    // naive solution
    public static int findOddOccurance(int a[]) {
        for (int i = 0; i < a.length; i++) {

            int count = 0;

            for (int j = 0; j < a.length; j++) {
                if (a[j] == a[i]) {
                    count++;
                }
            }
            if (count % 2 != 0) {
                return a[i];
            }
        }
        return 0;
    }

    // efficient solution
    public static int findOddOccurance2(int a[]) {

        int result = 0;

        for (int i = 0; i < a.length; i++) {
            result = result ^ a[i];

        }
        return result;
    }

}
