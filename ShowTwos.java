package testpackage;

import java.util.Scanner;

@SuppressWarnings("all")
public class ShowTwos {

    public static void showTwos(int x) {
        // Use a counter to count how many times the number is divisible by zero
        // then print "2*" for how many times the number was divisible by 2
        // and print the remainder which is x
        // ex: x=68 --> 68/2=34 --> 34/2=17
        // we divided by 2 twice and the remainder is 17
        // So the answer is 2*2*17
        if (x % 2 == 0) {
            int counter = 0;
            int y = x;
            while (x % 2 == 0) {
                x /= 2;
                counter++;
            }
            System.out.print(y + " = ");
            for (int i = 0; i < counter; i++) {
                System.out.print("2*");
            }
            System.out.print(x);
            System.out.println();
        } else {
            System.out.println(x + " = " + x);
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        showTwos(x);
    }
}
