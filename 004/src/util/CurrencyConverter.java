package util;

public class CurrencyConverter {

    public static final int IOF = 6;

    public static double converter (double quantityBuy, double priceDollar){
        double value = quantityBuy*priceDollar;
        return value+= value * IOF / 100; 
    }
    
}
