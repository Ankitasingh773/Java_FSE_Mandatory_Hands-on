public class Forecasting {
    public static double forecast(double currentValue, double growthRate, int years) {
        if (years == 0) {
            return currentValue;
        }
        return forecast(currentValue * (1 + growthRate), growthRate, years - 1);
    }
}
public class Main {
    public static void main(String[] args) {
        double presentValue = 10000;
        double growthRate = 0.10;
        int years = 5;
        double futureValue = Forecasting.forecast(presentValue, growthRate, years);
        System.out.printf(" Future Value after %d years: ₹%.2f%n", years, futureValue);
    }
}
