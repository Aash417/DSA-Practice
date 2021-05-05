package recursion;

public class AllPermutationOfAString {
    public static void main(String[] args) {

        String s = "ABC";
        int i=0;

        System.out.print(permuteString(s, i));
    }
    
    
    //code not working as intended///////
    
    
    
    public static char permuteString(String s, int i) {

        if (i == s.length() - 1) {
            System.out.println(s + "  ");
            return 0;
        }

        for (int j = i; j < s.length(); j++) {
            swap(s.charAt(i), s.charAt(j));
            permuteString(s, i + 1);
            swap(s.charAt(i), s.charAt(j));
        }
        return 0;
    }

    static void swap(char a, char b) {
        char c;
        c = a;
        a = b;
        b = c;
    }
}
