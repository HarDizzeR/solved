package testpackage;

import java.util.Arrays;
import java.util.Scanner;

@SuppressWarnings("all")
public class DeleteElement {

    public static void readArray(int[] a) {
        // This method reads the array values from user.
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < a.length; i++) {
            System.out.println("Enter Element [" + (i + 1) + "]: ");
            a[i] = in.nextInt();
        }
    }

    public static int[] deleteElement(int[] a, int pos) {
        // This method intializes a copy array of length a -1
        // And uses a for loop to check for if the value at i equals position
        // (i used two counters i , j to avoid some maths but doable without it)

        int[] c = new int[a.length - 1];
        for (int i = 0, j = 0; i < a.length; i++) {
            if (i != pos - 1) {
                c[j++] = a[i];
            }
        }
        // YOU HAVE TO USE PRINTARRAY METHOD IN HERE NOT IN MAIN.
        // IF YOU USE IN MAIN IT WILL PRINT A BUT YOU NEED TO PRINT C
        // WHICH IS DEFINED IN DELETEELEMENT METHOD
        printArray(c);
        return c;
    }

    public static void printArray(int[] c) {
        // This method prints Array.
        System.out.println(Arrays.toString(c));
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Size of Array: ");
        int[] a = new int[in.nextInt()];
        readArray(a);
        System.out.println("What's the element you want to delete: ");
        int pos = in.nextInt();
        if (pos > a.length) {
            System.out.println("Invalid position! Please enter position between 1 and " + a.length);
        } else {
            deleteElement(a, pos);
        }
        in.close();
    }
}
