import java.util.*;

class Result {
    /*
     * Complete the 'stringSimilarity' function below.
     * The function is expected to return an INTEGER.
     * The function accepts STRING s as parameter.
     */
    public static int stringSimilarity(String s) {
        int n = s.length();
        int[] z = new int[n];
        int l = 0, r = 0;
        
        for (int i = 1; i < n; i++) {
            if (i <= r) {
                z[i] = Math.min(r - i + 1, z[i - l]);
            }
            while (i + z[i] < n && s.charAt(z[i]) == s.charAt(i + z[i])) {
                z[i]++;
            }
            if (i + z[i] - 1 > r) {
                l = i;
                r = i + z[i] - 1;
            }
        }
        
        int sum = n; // similarity with itself
        for (int val : z) {
            sum += val;
        }
        return sum;
    }
}

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            String s = sc.next();
            System.out.println(Result.stringSimilarity(s));
        }
        sc.close();
    }
}
OUTPUT:

Input (stdin)
2
ababaa
aa
Expected Output
11
3
