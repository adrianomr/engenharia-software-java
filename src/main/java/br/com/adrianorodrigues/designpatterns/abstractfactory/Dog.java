package br.com.adrianorodrigues.designpatterns.abstractfactory;

public class Dog implements Animal {

    @Override
    public String getAnimal() {
        return "Dog";
    }

    @Override
    public String makeSound() {
        return "Uaauf";
    }
}
