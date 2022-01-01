package testpackage;

import java.util.Scanner;

public class NameShuffle {
    // A Method that just Reverses last name and first name by seperating the String
    // at the space then swapping whatever was behind the space
    // by whatever is infront of it
    // ex : Rick Astely > Astely Rick
    public static String nameShuffle(String s) {
        return s.substring(s.indexOf(" ") + 1) + " " + s.substring(0, s.indexOf(" "));
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        System.out.println(nameShuffle(s));
        in.close();
    }
}
