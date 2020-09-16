package br.com.adrianorodrigues.solid.openclose.goodexample;

public class TermPriceTable implements PriceTableStrategy {
    public double calculateDescount(Double value) {
        if (value > 100)
            return 0.05;
        return 0;
    }
}
