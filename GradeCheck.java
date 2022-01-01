package testpackage;

import java.util.Scanner;

public class GradeCheck {

    public static void gradeCheck(int[] numarr, String[] gradearr) {
        // This method checks for the highest and lowest grade
        // in a given array of String and integers.
        int minindex = 0;
        int min = numarr[0];
        int max = numarr[0];
        int maxindex = 0;
        // This for loop checks if the array value at index i is greater than max
        // Then assigns it to the max value setting its index as max index.
        for (int i = 1; i < gradearr.length; i++) {
            if (numarr[i] > max) {
                max = numarr[i];
                maxindex = i;
            }
            // This if condition checks if the array value at index i is less than min
            // Then assigns it to the min value setting its index as min index.
            if (numarr[i] < min) {
                min = numarr[i];
                minindex = i;
            }
        }
        System.out.println("The course with minimum grade is " + gradearr[minindex] + " with grade " + min);
        System.out.println("The course with maximum grade is " + gradearr[maxindex] + " with grade " + max);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("How many courses have you studied? ");
        int l = in.nextInt();
        int[] numarr = new int[l];
        String[] gradearr = new String[l];
        for (int i = 0; i < l; i++) {
            System.out.println("Enter your grade/100: ");
            numarr[i] = in.nextInt();
            System.out.println("Enter your course name: ");
            gradearr[i] = in.next();
        }
        gradeCheck(numarr, gradearr);
        in.close();
    }
}
