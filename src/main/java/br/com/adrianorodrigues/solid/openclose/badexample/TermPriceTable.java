package br.com.adrianorodrigues.solid.openclose.badexample;

public class TermPriceTable {
    public double calculateDescount(Double value) {
        if (value > 100)
            return 0.05;
        return 0;
    }
}
