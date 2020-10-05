package br.com.adrianorodrigues.designpatterns.creational.abstractfactory;

public interface AbstractFactory<T> {
    T create(String animalType);
}
