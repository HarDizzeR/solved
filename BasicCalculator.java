package testpackage;

import java.util.Scanner;

public class BasicCalculator {
    // Problem needed me to use a char variable as an operator
    public static int calculator(int num1, char operator, int num2) {
        int answer = 0;
        // if said operator is found , performs that operation and returns answer
        if (operator == '+') {
            answer = num1 + num2;
        } else if (operator == '-') {
            answer = num1 - num2;
        } else if (operator == '*') {
            answer = num1 * num2;
        } else if (operator == '/' && num2 != 0) {
            answer = num1 / num2;
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num1 = in.nextInt();
        // Since there's no nextChar in the Scanner method i use charAt(0) to always
        // take the first letter in the string written by user.
        // (Not counting exceptions)
        char operator = in.next().charAt(0);
        int num2 = in.nextInt();
        in.close();
        System.out.println(calculator(num1, operator, num2));
    }
}