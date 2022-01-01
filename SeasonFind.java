package testpackage;

import java.util.Scanner;

@SuppressWarnings("all")
public class SeasonFind {

    public static String seasonFind(int month, int day) {
        // This problem is the defintion of Cringe.
        // An if condition for every single month and day combination possible.
        // Instead use 3 conditions , 2 are specific for days
        // And the two months in between are general.
        String answer = "";
        if (month > 0 && day > 0) {
            if (day <= 31 && month <= 12) {
                if ((month == 12 && day >= 16) || (month < 3) || (month == 3 && day <= 15)) {
                    answer += "Winter";
                } else if ((month == 3 && day >= 16) || (month < 6) || (month == 6 && day <= 15)) {
                    answer += "Spring";
                } else if ((month == 6 && day >= 16) || (month < 9) || (month == 9 && day <= 15)) {
                    answer += "Summer";
                } else if ((month == 9 && day >= 16) || (month < 12) || (month == 12 && day <= 15)) {
                    answer += "Fall";
                }
            }
        } else {
            System.out.println("Invalid input");
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int month = in.nextInt();
        int day = in.nextInt();
        System.out.println(seasonFind(month, day));
    }
}
