package br.com.adrianorodrigues.solid.openclose.goodexample;

public class CashPriceTable implements PriceTableStrategy {
    public double calculateDescount(Double value) {
        if (value > 100)
            return 0.1;
        return 0.05;
    }
}
