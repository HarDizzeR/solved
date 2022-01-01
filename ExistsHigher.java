package testpackage;

import java.util.Scanner;

public class ExistsHigher {

    public static boolean existsHigher(int[] arr, int n) {
        // This method checks if theres a higher value than the value the user asigned
        // returning a true if a number is found and a false if not.
        boolean answer = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= n) {
                answer = true;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        // Intializing array.
        Scanner in = new Scanner(System.in);
        int[] arr = new int[10];
        System.out.println("Enter number you want to check: ");
        int n = in.nextInt();
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter numbers in array: ");
            arr[i] = in.nextInt();
        }
        in.close();
        System.out.println(existsHigher(arr, n));
    }
}
