import java.io.*;
import java.util.*;

class Result {

    /*
     * Complete the 'matrixRotation' function below.
     *
     * The function prints the rotated matrix.
     * The function accepts following parameters:
     *  1. 2D INTEGER_ARRAY matrix
     *  2. INTEGER r (number of rotations)
     */

    public static void matrixRotation(List<List<Integer>> matrix, int r) {
        int m = matrix.size();
        int n = matrix.get(0).size();

        // Number of layers
        int layers = Math.min(m, n) / 2;

        for (int layer = 0; layer < layers; layer++) {
            // Extract elements of this layer into a list
            List<Integer> elements = new ArrayList<>();
            // top row
            for (int j = layer; j < n - layer; j++) {
                elements.add(matrix.get(layer).get(j));
            }
            // right column
            for (int i = layer + 1; i < m - layer - 1; i++) {
                elements.add(matrix.get(i).get(n - layer - 1));
            }
            // bottom row
            for (int j = n - layer - 1; j >= layer; j--) {
                elements.add(matrix.get(m - layer - 1).get(j));
            }
            // left column
            for (int i = m - layer - 2; i > layer; i--) {
                elements.add(matrix.get(i).get(layer));
            }

            int len = elements.size();
            int rot = r % len;

            // Rotate the list
            List<Integer> rotated = new ArrayList<>();
            for (int i = 0; i < len; i++) {
                rotated.add(elements.get((i + rot) % len));
            }

            // Put rotated elements back into matrix
            int idx = 0;
            for (int j = layer; j < n - layer; j++) {
                matrix.get(layer).set(j, rotated.get(idx++));
            }
            for (int i = layer + 1; i < m - layer - 1; i++) {
                matrix.get(i).set(n - layer - 1, rotated.get(idx++));
            }
            for (int j = n - layer - 1; j >= layer; j--) {
                matrix.get(m - layer - 1).set(j, rotated.get(idx++));
            }
            for (int i = m - layer - 2; i > layer; i--) {
                matrix.get(i).set(layer, rotated.get(idx++));
            }
        }

        // Print the rotated matrix
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix.get(i).get(j) + " ");
            }
            System.out.println();
        }
    }
}

public class Solution {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int r = sc.nextInt();

        List<List<Integer>> matrix = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            List<Integer> row = new ArrayList<>();
            for (int j = 0; j < n; j++) {
                row.add(sc.nextInt());
            }
            matrix.add(row);
        }

        Result.matrixRotation(matrix, r);
        sc.close();
    }
}

OUTPUT:

Input (stdin)
4 4 1
1 2 3 4
5 6 7 8
9 10 11 12
13 14 15 16
Expected Output
2 3 4 8
1 7 11 12
5 6 10 16
9 13 14 15
