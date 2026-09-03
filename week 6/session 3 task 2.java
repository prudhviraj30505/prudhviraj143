import java.util.*;

class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> result = new ArrayList<>();
        if (s.length() < p.length()) return result;  
        int[] countP = new int[26];
        int[] countS = new int[26];
        for (char c : p.toCharArray()) {
            countP[c - 'a']++;
        }
        for (int i = 0; i < s.length(); i++) {
            countS[s.charAt(i) - 'a']++;
            if (i >= p.length()) {
                countS[s.charAt(i - p.length()) - 'a']--;
            }
            if (Arrays.equals(countP, countS)) {
                result.add(i - p.length() + 1);
            }
        }
        return result;
    }
}

OUTPUT:
Input
s =
"abab"
p =
"ab"
Output
[0,1,2]
Expected
[0,1,2]
