package school.lemon.strings;

import java.text.DecimalFormat;

public class CurrencyFormatter {

    public static void main(String[] args) {
        System.out.println(currencyFormate(12356789234.2323));
    }

    public static String currencyFormate(double amount){
        DecimalFormat decimalFormat = new DecimalFormat("###,###,###,###.##");
        return decimalFormat.format(amount);
    }
}
