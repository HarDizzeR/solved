package testpackage;

public class MoneyProfit {
    public static void main(String[] args) {
        double money = 1000;
        double profit = 5.0 / 100.0;
        // Money per year is just the money you invest times profit
        double moneyperyear = money * profit;
        // temporary value x so you dont modify money variable
        double x = money;
        int year = 0;
        // while x isnt double money it keeps adding moneyperyear till it reaches double
        while (x != 2 * money) {
            x += moneyperyear;
            year++;
        }
        System.out.println("Your money will double after " + year + " years.");
    }
}
