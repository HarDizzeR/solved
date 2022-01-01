package testpackage;

import java.util.Scanner;

public class RepeatCheck {

    public static void repeatCheck(int[] num, int x) {
        // This Method checks how many a number is repeated in an array.
        // It increases a counter everytime a number equals the entered number
        int counter = 0;
        for (int i = 0; i < num.length; i++) {
            if (num[i] == x) {
                counter++;
            }
        }
        System.out.println("The element " + x + " is repeated " + counter + " times.");
    }

    public static void main(String[] args) {
        // Intializing arrays
        Scanner in = new Scanner(System.in);
        System.out.println("Enter array size: ");
        int elements = in.nextInt();
        int[] num = new int[elements];
        System.out.println("Enter " + elements + " values of elements:");
        for (int i = 0; i < num.length; i++) {
            System.out.println("A[" + (i + 1) + "]= ");
            num[i] = in.nextInt();
        }
        System.out.println("Enter the element that you want to check its occurence: ");
        int x = in.nextInt();
        repeatCheck(num, x);
        in.close();
    }
}