package br.com.adrianorodrigues.designpatterns.factory;

public class Triangle implements Polygon {
    @Override
    public String getType() {
        return "Triangle";
    }
}
