package testpackage;

import java.util.Scanner;

public class CountTrue {
    // A method that counts how many true values exist in a boolean array.
    public static int countTrue(boolean[] arr) {
        int counter = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == true) {
                counter++;
            }
        }
        return counter;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the Array Size: ");
        boolean[] arr = new boolean[in.nextInt()];
        countTrue(arr);
        in.close();
    }
}
