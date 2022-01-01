package testpackage;

import java.util.Arrays;
import java.util.Scanner;

@SuppressWarnings("all")
public class CourseCheck {
    // Yeah this one is more cringe than the Seasons problem :)
    // Delcaring Static Variable Outside of main
    // (Doesn't Matter if inside main , just for better readability)
    // Delcaring 2D Arrays where Row is Courses
    // Declaring More 2D Arrays where values are every course's Credits
    static int credit = 200;
    static String[][] Courses1 = {
            { "-Introduction to programming", "-Physics", "-Chemistry" },
            { "-Object Oriented Programming", "-Discrete Structures I" },
    };
    static String[][] Courses2 = {
            { "-Data Structures", "-Math", "-Discrete Structures II" },
            { "-Database", "-Computer Architecture" },
    };
    static String[] Courses3 = {};

    static int[][] Courses1Creds = {
            { 3, 2, 2 },
            { 3, 3 },
    };
    static int[][] Courses2Creds = {
            { 3, 1, 3 },
            { 2, 3 },
    };
    static int[][] Courses3Creds = {};

    public static void main(String[] args) {
        int x = 0;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Year: ");
        int year = in.nextInt();
        System.out.println("Enter Semester: ");
        int semester = in.nextInt();
        // checks for year then checks if its in the range of the course
        // then uses a for loop from 0 to row length minus one because index starts at 0
        // Prints Available Courses in the for loop and calculates how many creds are
        // used. Then Prints the money which is total credits * each credit value
        // Repeats for every year
        if (year == 1) {
            if (semester <= Courses1.length) {
                System.out.println("Available courses are: ");
                for (int i = 0; i < Courses1[semester - 1].length; i++) {
                    System.out.println((Courses1[semester - 1][i]));
                    x += (Courses1Creds[semester - 1][i]);
                }
                System.out.println("Total number of credits is: " + x);
                System.out.println("Total Cost is: $" + (x * credit));
            } else {
                System.out.println("Invalid semester. There is only two semesters every year.");
            }
        } else if (year == 2) {
            if (semester <= Courses2.length) {
                System.out.println("Available courses are: ");
                for (int i = 0; i < Courses2[semester - 1].length; i++) {
                    System.out.println((Courses2[semester - 1][i]));
                    x += (Courses2Creds[semester - 1][i]);
                }
                System.out.println("Total number of credits is: " + x);
                System.out.println("Total Cost is: $" + (x * credit));
            } else {
                System.out.println("Invalid semester. There is only two semesters every year.");
            }
        } else if (year == 3) {
            System.out.println("No available courses for this semester now. Check again later.");
        } else if (year > 3) {
            System.out.println("Invalid year.");
        }
    }
}
