package br.com.adrianorodrigues.solid.openclose.badexample;

import java.util.logging.Logger;

public class PriceCalculator {
    /*
    This is a bad example
    Because descount calc rule is open to Price Calculator
    This results on fat and complex method because of number of cases needed
    to add more rules
    More info:
    https://medium.com/@mari_azevedo/princ%C3%ADpios-s-o-l-i-d-o-que-s%C3%A3o-e-porque-projetos-devem-utiliz%C3%A1-los-bf496b82b299
     */
    public double calculate(Product product) {
        double desconto = 0d;

        int paymentMethod = product.getPaymentMethod();

        switch (paymentMethod) {
            case 1:
                Logger.getGlobal().info("Venda à vista");
                CashPriceTable tabela1 = new CashPriceTable();
                desconto = tabela1.calculateDescount(product.getValue());
                break;
            case 2:
                Logger.getGlobal().info("Venda à prazo");
                TermPriceTable tabela2 = new TermPriceTable();
                desconto = tabela2.calculateDescount(product.getValue());
                break;
        }

        return product.getValue() * (1 - desconto);
    }
}
