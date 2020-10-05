package br.com.adrianorodrigues.designpatterns.abstractfactory;

import br.com.adrianorodrigues.interfaces.Executable;

import java.util.logging.Logger;

public class AbstractFactoryExecutor implements Executable {
    @Override
    public String getTitle() {
        return "Abstract Factory";
    }

    public void execute() {
        AbstractFactory<Animal> animalFactory = FactoryProvider
                .getFactory("Animal");
        Animal animal = animalFactory.create("Dog");
        Logger.getGlobal().info(animal.getAnimal() + " - " + animal.makeSound());
    }
}
