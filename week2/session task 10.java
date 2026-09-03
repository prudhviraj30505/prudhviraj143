java 15 code:

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Deque<Integer> deque = new ArrayDeque<>();
        int n = in.nextInt();
        int m = in.nextInt();

        // Array to store the frequency of elements (assuming elements are within a reasonable range)
        int[] freq = new int[10000001];
        int unique = 0;
        int maxUnique = 0;

        for (int i = 0; i < n; i++) {
            int num = in.nextInt();
            
            // Add current element to the window
            deque.addLast(num);
            if (freq[num] == 0) {
                unique++;
            }
            freq[num]++;

            // Once the window reaches size 'm'
            if (deque.size() == m) {
                if (unique > maxUnique) {
                    maxUnique = unique;
                }

                // Remove the oldest element from the left of the window
                int removed = deque.removeFirst();
                freq[removed]--;
                if (freq[removed] == 0) {
                    unique--;
                }
            }
        }

        System.out.println(maxUnique);
        in.close();
    }
}

OUTPUT:

Input (stdin)
6 3
5 3 5 2 3 2
Your Output (stdout)
3
Expected Output
3
