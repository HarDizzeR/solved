package testpackage;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        // Intializing 4 variables : Number being the number we want to use , counter is
        // just a counter so we dont modify the original number
        // Reverse is the reversed value ,
        // temp is another temporary number for reversing.
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your number: ");
        int number = in.nextInt();
        int counter = 0;
        int reverse = 0;
        int temp = number;
        // the while loop is to determine the size of the array by removing a digit one
        // by one till its 0
        // ex : 645789 > divided by 10 > 64578 (1)> 6457 (2) >645 (3) > 64 (4) > 6 (5) >
        // 64578 (1)> 6457 (2) >645 (3) > 64 (4) > 6 (5) > 0 (6)
        while (temp != 0) {
            temp /= 10;
            counter++;
        }
        in.close();
        // Temporary String to convert number to a string for me to use String Methods.
        String s1 = Integer.toString(number);
        int[] arr = new int[counter];
        // Intializing the Array Based on a for loop
        // that takes the character at i in the temporary string
        // Then take the Value of it And Parses it into an Integer Again.
        // (Couldn't think of another way to do it but im pretty sure there is one.)
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(String.valueOf(s1.charAt(i)));
        }
        System.out.println("Array is : " + Arrays.toString(arr));
        // Reverse the number by Taking the last digit ,
        // saving it in a temporary remainder variable
        // then adds an extra Digit by multiplying 10 then adding the remainder back
        // then Removes the last digit and repeats
        // ex : 645789 % 10 > 64578 > 9 is stored in remainder
        // reverse = 0*10 + 9
        // 645789 / 10 > removes the last number and repeats
        while (number != 0) {
            int remainder = number % 10;
            reverse = reverse * 10 + remainder;
            number /= 10;
        }
        System.out.println("The reverse of the given number is: " + reverse);
    }
}