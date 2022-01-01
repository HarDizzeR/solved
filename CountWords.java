package testpackage;

import java.util.Scanner;

public class CountWords {
    // A method that counts the words in a String
    // It splits the String for every space it has then returns the array length
    // (split method returns a string array)
    public static int countWords(String s1) {
        String[] arr = s1.split(" ");
        return arr.length;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s1 = in.nextLine();
        System.out.println(countWords(s1));
        in.close();
    }
}
