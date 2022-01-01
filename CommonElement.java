package testpackage;

import java.util.Arrays;
import java.util.Scanner;

public class CommonElement {

    public static void findCommon(int[] arr1, int[] arr2) {
        // The method uses an empty string and a nested for loop
        // to compare between both arrays at all indices
        // Then adds the common value to the empty string
        String common = "";
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i] == arr2[j]) {
                    common += arr1[i] + " ";
                }
            }
        }
        System.out.print("Common elements between the two arrays: ");
        System.out.println(common);
    }

    public static void main(String[] args) {
        // Array intialization by user in a for loop.
        Scanner in = new Scanner(System.in);
        int l = in.nextInt();
        int[] arr1 = new int[l];
        int[] arr2 = new int[l];
        for (int i = 0; i < l; i++) {
            arr1[i] = in.nextInt();
            arr2[i] = in.nextInt();
        }
        in.close();
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
        findCommon(arr1, arr2);
    }
}
