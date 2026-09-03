import java.util.*;

public class Solution {
    public static String timeConversion(String s) {
        // Extract parts
        String ampm = s.substring(8); // AM or PM
        int hour = Integer.parseInt(s.substring(0, 2));
        String rest = s.substring(2, 8); // :MM:SS

        if (ampm.equals("AM")) {
            if (hour == 12) {
                hour = 0; // midnight case
            }
        } else { // PM
            if (hour != 12) {
                hour += 12; // convert to 24-hour format
            }
        }

        return String.format("%02d%s", hour, rest);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println(timeConversion(s));
        sc.close();
    }
}

OUTPUT:
Input (stdin)
07:05:45PM
Your Output (stdout)
19:05:45
Expected Output
19:05:45
