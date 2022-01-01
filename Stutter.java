package testpackage;

import java.util.Scanner;

public class Stutter {

    public static String stutter(String word) {
        // This method retypes a word as if someone is struggling to pronounce that word
        // ex: College > Co.. Co.. College?
        // You just take the first two letters at first two indices followed by
        // three dots twice added to the original word followed by a question mark
        String answer = "";
        answer += word.substring(0, 2) + "... " + word.substring(0, 2) + "... " + word + "?";
        return answer;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Your Word: ");
        System.out.println(stutter(in.nextLine()));
        in.close();
    }
}
