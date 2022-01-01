package testpackage;

import java.util.Arrays;
import java.util.Scanner;

@SuppressWarnings("all")
public class SeperateEvenOdd {
    public static void readArray(int[] a) {
        // Reads Array.
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < a.length; i++) {
            System.out.print("Element[" + (1 + i) + "]= ");
            a[i] = in.nextInt();
        }
    }

    public static void splitEvenOdd(int[] a, int[] even, int[] odd) {
        // j,k variables are counters for even , odd array
        // Since you cant use i+1 because all 3 arrays have different sizes
        int j = 0;
        int k = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0) {
                even[j++] = a[i];
            } else {
                odd[k++] = a[i];
            }
        }
        printArray(even);
        printArray(odd);
    }

    public static void printArray(int[] a) {
        System.out.println(Arrays.toString(a));
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Array Size: ");
        int length = in.nextInt();
        int evenSize = 0;
        int oddSize = 0;
        int[] a = new int[length];
        readArray(a);
        // Determines even array and odd array sizes.
        for (int i = 0; i < length; i++) {
            if (a[i] % 2 == 0)
                evenSize++;
            else
                oddSize++;
        }
        int[] even = new int[evenSize];
        int[] odd = new int[oddSize];
        splitEvenOdd(a, even, odd);
    }
}
