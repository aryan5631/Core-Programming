import java.util.*;
public class ProfitLossCalculator {
    public static void main(String[] args) {
        int costPrice = 129;
        int selling = 191;

        int profit = selling - costPrice;
        double profitPer = (profit / (double) costPrice) * 100;

        System.out.println(costPrice);
        System.out.println(selling);
        System.out.println(profit);
        System.out.println(profitPer);
    }
}
