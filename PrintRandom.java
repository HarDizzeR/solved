package testpackage;

public class PrintRandom {
    public static void main(String[] args) {
        int x = 0;
        do {
            x = (int) Math.round(Math.random() * 1000);
            System.out.println(x);
        } while (x <= 900);
    }
}
