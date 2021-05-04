package recursion;

public class GenrateSubsets {
    public static void main(String[] args) {
        String str = "ABCd";
        subsets(str, "", 0);
    }

    public static void subsets(String s, String current, int index) {
        if (index == s.length()) {
            System.out.println(current + "  ");
            return;
        }

        subsets(s, current, index + 1);
        subsets(s, current + s.charAt(index), index + 1);

    }
}
