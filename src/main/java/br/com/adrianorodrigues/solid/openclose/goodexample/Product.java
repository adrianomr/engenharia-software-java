package br.com.adrianorodrigues.solid.openclose.goodexample;

public class Product {
    private Integer paymentMethod;
    private Double value;

    public Integer getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(Integer paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public Double getValue() {
        return value;
    }

    public void setValue(Double value) {
        this.value = value;
    }
}
