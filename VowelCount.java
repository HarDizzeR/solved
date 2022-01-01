package testpackage;

import java.util.Arrays;
import java.util.Scanner;

@SuppressWarnings("all")
public class VowelCount {

    // a[0]= A's count
    // a[1]= E's count
    // a[2]= I's count
    // a[3]= O's count
    // a[4]= U's count

    public static int[] vowelCount(String s1) {
        int[] a = new int[5];
        int A = 0;
        int E = 0;
        int I = 0;
        int O = 0;
        int U = 0;
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) == 'A' || s1.charAt(i) == 'a') {
                A++;
            } else if (s1.charAt(i) == 'E' || s1.charAt(i) == 'e') {
                E++;
            } else if (s1.charAt(i) == 'I' || s1.charAt(i) == 'i') {
                I++;
            } else if (s1.charAt(i) == 'O' || s1.charAt(i) == 'o') {
                O++;
            } else if (s1.charAt(i) == 'U' || s1.charAt(i) == 'u') {
                U++;
            }
        }
        a[0] = A;
        a[1] = E;
        a[2] = I;
        a[3] = O;
        a[4] = U;
        return a;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s1 = in.nextLine();
        System.out.println(Arrays.toString(vowelCount(s1)));
    }
}
