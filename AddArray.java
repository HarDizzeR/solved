package testpackage;

import java.util.Arrays;
import java.util.Scanner;

@SuppressWarnings("all")
/**
 * AddArray
 */
public class AddArray {
    public static void readArray(int[] a) {
        // This method intializes array.
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < a.length; i++) {
            System.out.println("Enter value at [" + (i + 1) + "] ");
            a[i] = in.nextInt();
        }
    }

    public static int[] addTwoArrays(int[] a, int[] b, int[] c) {
        // This method defines a new array then adds the values of a and b at a certain
        // index and saves it in that same index at new array C
        // then uses printarray method to print the new array.
        for (int i = 0; i < c.length; i++) {
            c[i] = a[i] + b[i];
        }
        printArray(c);
        return c;
    }

    public static void printArray(int[] c) {
        System.out.println(Arrays.toString(c));
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Size of two arrays: ");
        int length = in.nextInt();
        int[] a = new int[length];
        int[] b = new int[length];
        int[] c = new int[length];
        readArray(a);
        readArray(b);
        addTwoArrays(a, b, c);
        in.close();
    }
}