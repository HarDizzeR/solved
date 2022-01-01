package testpackage;

import java.util.Scanner;

public class ConvertSeconds {
    // A method that turns minutes into seconds, Doesn't need explaining.
    public static int convert(int minutes) {
        int answer = 0;
        answer += minutes * 60;
        return answer;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int minutes = in.nextInt();
        in.close();
        System.out.println(convert(minutes));
    }
}
