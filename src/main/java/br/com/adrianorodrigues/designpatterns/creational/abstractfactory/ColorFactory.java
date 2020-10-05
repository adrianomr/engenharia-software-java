package br.com.adrianorodrigues.designpatterns.creational.abstractfactory;

public class ColorFactory implements AbstractFactory<Color> {

    @Override
    public Color create(String animalType) {
        if ("White".equalsIgnoreCase(animalType)) {
            return new White();
        } else if ("Black".equalsIgnoreCase(animalType)) {
            return new Black();
        }

        return null;
    }

}
