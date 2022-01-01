package testpackage;

import java.util.Scanner;

public class CircuitCalculate {
    // Problem wasn't specific so i just calculated both possibilites
    public static void Circuit(double r1, double r2) {
        System.out.println(r1 + r2);
        System.out.println((r1 * r2) / (r1 + r2));

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Resistor Values: ");
        double r1 = in.nextInt();
        double r2 = in.nextInt();
        Circuit(r1, r2);
        in.close();
    }
}
