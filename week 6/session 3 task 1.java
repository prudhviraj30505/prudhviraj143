import java.util.*;
public class Solution {
    public static int marsExploration(String s) {
        int changes = 0;
        String sos = "SOS";
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != sos.charAt(i % 3)) {
                changes++;
            }
        }
        return changes;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println(marsExploration(s));
        sc.close();
    }
}

OUTPUT:
Input (stdin)
SOSSPSSQSSOR
Your Output (stdout)
3
Expected Output
3
