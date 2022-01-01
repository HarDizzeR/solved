package testpackage;

import java.util.Scanner;

@SuppressWarnings("all")
public class AverageDiagonal {

    public static void readNbyNArray(int[][] a) {
        // Reads Array.
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.println("Enter Number at[" + (i + 1) + "][" + (j + 1) + "]");
                a[i][j] = in.nextInt();
            }
        }
    }

    public static void printArray(int[][] a) {
        // Prints Array.
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static double AverageOfDiagonal(int[][] a) {
        // Calculates Average by Summing elements of diagonal divided by array length
        int answer = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                if (i == j)
                    answer += a[i][j];
            }
        }
        return (double) answer / a.length;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Array Dimensions: ");
        int length = in.nextInt();
        int[][] a = new int[length][length];
        readNbyNArray(a);
        printArray(a);
        System.out.println(AverageOfDiagonal(a));
    }
}
