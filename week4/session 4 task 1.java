import java.util.*;

class Result {
    /*
     * Complete the 'diagonalDifference' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts 2D_INTEGER_ARRAY arr as parameter.
     */
    public static int diagonalDifference(List<List<Integer>> arr) {
        int n = arr.size();
        int primary = 0;
        int secondary = 0;

        for (int i = 0; i < n; i++) {
            primary += arr.get(i).get(i);              // left-to-right diagonal
            secondary += arr.get(i).get(n - i - 1);    // right-to-left diagonal
        }

        return Math.abs(primary - secondary);
    }
}

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<List<Integer>> arr = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            List<Integer> row = new ArrayList<>();
            for (int j = 0; j < n; j++) {
                row.add(sc.nextInt());
            }
            arr.add(row);
        }

        int result = Result.diagonalDifference(arr);
        System.out.println(result);
        sc.close();
    }
}

OUTPUT:

Input (stdin)
3
11 2 4
4 5 6
10 8 -12
Your Output (stdout)
15
Expected Output
15
