package testpackage;

import java.util.Scanner;

public class TriangleNumbers {
    // A method that calculates the Triangular Numbers based on the digit you enter
    // A triangular number is calculated based on this formula
    // nth term = n + (n - 1) + (n - 2) + (n - 3) + … + 3 + 2 + 1
    public static int triangle(int n) {
        int answer = 0;
        for (int i = 0; i < n; i++) {
            answer += n - i;
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        in.close();
        System.out.println(triangle(n));
    }
}
