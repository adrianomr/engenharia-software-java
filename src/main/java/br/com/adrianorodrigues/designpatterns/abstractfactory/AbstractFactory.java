package br.com.adrianorodrigues.designpatterns.abstractfactory;

public interface AbstractFactory<T> {
    T create(String animalType);
}
