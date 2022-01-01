package testpackage;

import java.util.Scanner;

@SuppressWarnings("all")
public class IdentityCheck {

    // The main diagonal of the identity matrix is where both row and column are
    // equal to one so for the first it would be row 0 column 0
    // {1, 0, 0}
    // {0, 1, 0}
    // {0, 0, 1}
    // So the method just checks if the matrix given has 1's when both row and
    // column are on the same index and vice versa on 0's
    public static boolean identityCheck(int[][] a) {
        boolean flag = true;
        int rows = a.length;
        int cols = a[0].length;
        if (rows != cols) {
            System.out.println("Matrix should be a Square Matrix.");
        } else {
            for (int i = 0; i < a.length; i++) {
                for (int j = 0; j < a.length; j++) {
                    if (i == j && a[i][j] != 1) {
                        flag = false;
                        break;
                    }
                    if (i != j && a[i][j] != 0) {
                        flag = false;
                        break;
                    }
                }
            }
        }
        return flag;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number of rows in array: ");
        int row = in.nextInt();
        System.out.println("Enter number of columns in array: ");
        int col = in.nextInt();
        int[][] a = new int[row][col];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                a[i][j] = in.nextInt();
            }
        }
        if (identityCheck(a)) {
            System.out.println("This is an identity Matrix");
        } else {
            System.out.println("This is notan identity Matrix");
        }
    }
}
