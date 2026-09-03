import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while (t-- > 0) {
            String s = sc.next();
            int n = s.length();
            
            // Split into two halves
            String left = s.substring(0, n / 2);
            String right = (n % 2 == 0) ? s.substring(n / 2) : s.substring(n / 2 + 1);
            
            // Count frequency of characters in both halves
            int[] freqLeft = new int[26];
            int[] freqRight = new int[26];
            
            for (char c : left.toCharArray()) {
                freqLeft[c - 'a']++;
            }
            for (char c : right.toCharArray()) {
                freqRight[c - 'a']++;
            }
            
            // Compare frequencies
            boolean isLapindrome = true;
            for (int i = 0; i < 26; i++) {
                if (freqLeft[i] != freqRight[i]) {
                    isLapindrome = false;
                    break;
                }
            }
            
            System.out.println(isLapindrome ? "YES" : "NO");
        }
        
        sc.close();
    }
}

OUTPUT:

Time:
0.0700 secs
Memory:
42.508 Mb
Sample Input
6
gaga
abcde
rotor
xyzxy
abbaab
ababc
Your Output
YES
NO
YES
YES
NO
NO
