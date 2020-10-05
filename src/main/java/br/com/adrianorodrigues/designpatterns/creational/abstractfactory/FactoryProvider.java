package br.com.adrianorodrigues.designpatterns.creational.abstractfactory;

public class FactoryProvider {
    private FactoryProvider() {
    }

    public static AbstractFactory getFactory(String choice) {

        if ("Animal".equalsIgnoreCase(choice)) {
            return new AnimalFactory();
        } else if ("Color".equalsIgnoreCase(choice)) {
            return new ColorFactory();
        }

        return null;
    }
}
