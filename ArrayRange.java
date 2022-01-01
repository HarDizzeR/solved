package testpackage;

import java.util.Arrays;
import java.util.Scanner;

@SuppressWarnings("all")
public class ArrayRange {

    public static void readArray(int[] a) {
        // This method intializes array.
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < a.length; i++) {
            System.out.println("Enter value at [" + (i + 1) + "] ");
            a[i] = in.nextInt();
        }
    }

    public static void printArray(int[] c) {
        // This method prints array.
        System.out.println(Arrays.toString(c));
    }

    public static int countInRange(int[] a, int min, int max) {
        // This method adds 1 to counter if value at a is bigger than minimum
        // And less than maximum.
        int counter = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] >= min && a[i] <= max) {
                counter++;
            }
        }
        return counter;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Array Size: ");
        int length = in.nextInt();
        int[] a = new int[length];
        readArray(a);
        printArray(a);
        System.out.println("Enter Minimum value: ");
        int min = in.nextInt();
        System.out.println("Enter Maximum value: ");
        int max = in.nextInt();
        System.out.println(
                "There is " + countInRange(a, min, max) + " elements whose values fall between " + min + " And " + max);
    }
}
