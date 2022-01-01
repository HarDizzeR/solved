package testpackage;

import java.util.Scanner;

public class ArrayCheck {

    public static void Search(int[] num, int x) {
        // flag to break out of the loop when confirmed could be either a 0 then
        // incremenating to 1 or a boolean variable from false to true.
        int flag = 0;
        for (int i = 0; i < num.length; i++) {
            if (num[i] == x) {
                // increments the flag if the number is found so it breaks the loop.
                System.out.println("Number " + x + " is at index " + i);
                flag++;
                break;
            }
        }
        // print not found if flag not incremented.
        if (flag == 0) {
            System.out.println("Number " + x + " is  not found in the array!");
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter size of array: ");
        int[] num = new int[in.nextInt()];
        // Intializing the array.
        for (int i = 0; i < num.length; i++) {
            System.out.println("Enter element [" + (i + 1) + "] ");
            num[i] = in.nextInt();
        }
        System.out.println("What is the number you want to search for ? ");
        int x = in.nextInt();
        in.close();
        Search(num, x);
    }
}
