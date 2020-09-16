package br.com.adrianorodrigues.solid.openclose.goodexample;

public class PriceCalculator {
    /*
    This is a good example
    Utilizing strategy pattern we remove discount calc from PriceCalculator
    This allows us to utilize it without having to modify the calc rule
    Resulting into a less complex class
    More info:
    https://medium.com/@mari_azevedo/princ%C3%ADpios-s-o-l-i-d-o-que-s%C3%A3o-e-porque-projetos-devem-utiliz%C3%A1-los-bf496b82b299
     */
    public double calculate(Product product, PriceTableStrategy priceTableStrategy) {
        double discount = priceTableStrategy.calculateDescount(product.getValue());
        return product.getValue() * (1 - discount);
    }
}
