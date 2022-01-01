package testpackage;

import java.util.Scanner;

@SuppressWarnings("all")
public class CountZero {
    public static int countZeros(int x) {
        // This method takes last digit of value and checks if its equal to zero
        // if it does adds 1 to counter if not it removes the digit and repeats.
        int y = 0;
        int answer = 0;
        while (x != 0) {
            y = x % 10;
            if (y == 0) {
                answer++;
            }
            x /= 10;
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        System.out.println(countZeros(x));
    }
}
