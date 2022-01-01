package testpackage;

import java.util.Scanner;

public class CheckEnding {
    // The method checks if the end of String A is the same as String B
    // For example : Feminine , nine
    public static boolean checkEnding(String str1, String str2) {
        boolean answer = false;
        if (str1.endsWith(str2)) {
            answer = true;
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str1 = in.nextLine();
        String str2 = in.nextLine();
        in.close();
        System.out.println(checkEnding(str1, str2));
    }
}
