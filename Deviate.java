package testpackage;

import java.util.Scanner;

public class Deviate {
    // Steps to calculate Standard Deviation.
    // Step 1: Find the mean.
    // Step 2 : For each data point, find the square of its distance to the mean.
    // Step 3 : Sum the values from Step 2.
    // Step 4 : Divide bythe number of data points.
    // Step 5:Take the square root.

    public static double mean(int[] num) {
        // The Method calculates the mean of the values in the array.
        double result = 0;
        for (int i = 0; i < num.length; i++) {
            result += num[i];
        }
        result /= num.length;
        return result;
    }

    public static double deviate(int[] num) {
        // This method deviates using the previous method and the formula stated above.
        double result = 0;
        double m = mean(num);
        for (int i = 0; i < num.length; i++) {
            result += Math.pow(num[i] - m, 2);
        }
        return Math.sqrt(result / num.length);
    }

    public static void main(String[] args) {
        // Intializing Array.
        Scanner in = new Scanner(System.in);
        int[] num = new int[in.nextInt()];
        for (int i = 0; i < num.length; i++) {
            num[i] = in.nextInt();
        }
        System.out.println(deviate(num));
        in.close();
    }
}