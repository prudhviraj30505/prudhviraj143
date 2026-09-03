import java.util.*;

public class Solution {
    public static String twoStrings(String s1, String s2) {
        Set<Character> set = new HashSet<>();
        
        for (char c : s1.toCharArray()) {
            set.add(c);
        }
        
        for (char c : s2.toCharArray()) {
            if (set.contains(c)) {
                return "YES";
            }
        }
        
        return "NO";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int q = sc.nextInt();
        while (q-- > 0) {
            String s1 = sc.next();
            String s2 = sc.next();
            System.out.println(twoStrings(s1, s2));
        }
        sc.close();
    }
}

OUTPUT:

Input (stdin)
2
hello
world
hi
world
Expected Output
YES
NO
