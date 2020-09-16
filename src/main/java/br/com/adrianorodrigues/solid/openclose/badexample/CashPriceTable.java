package br.com.adrianorodrigues.solid.openclose.badexample;

public class CashPriceTable {
    public double calculateDescount(Double value) {
        if (value > 100)
            return 0.1;
        return 0.05;
    }
}
