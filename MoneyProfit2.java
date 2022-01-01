package testpackage;

public class MoneyProfit2 {
    public static void main(String[] args) {
        double money = 5000;
        double profit = 10.0 / 100.0;
        int year = 5;
        // Calculate profit per year
        // Amount of money is money + profit multiplied by money
        // ex: x= 5000 + (10.0/100.0 * 5) * 5000 = 7500
        double profitperyears = profit * year;
        double x = money + profitperyears * money;

        System.out.println("You money after 5 years will be: " + x);
    }
}
