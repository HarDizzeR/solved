package testpackage;

import java.util.Scanner;

@SuppressWarnings("all")
public class AverageLength {

    public static double averageLength(String[] a) {
        // Intialize an empty string to store words in array
        // Then store every element in array in that string
        // then takes average by using the new string.length method
        // divided by length -1 since i added 1 when intializing array
        String s2 = "";
        for (int i = 0; i < a.length; i++) {
            s2 += a[i];
        }
        return (double) s2.length() / (a.length - 1);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter size of array: ");
        // I add +1 because for somereason it made me add one less value than the number
        // i specify.
        String[] a = new String[in.nextInt() + 1];
        for (int i = 0; i < a.length; i++) {
            a[i] = in.nextLine();
        }
        System.out.println(averageLength(a));
    }
}
