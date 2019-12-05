package br.com.adriano.singleton;

public class Singleton {

    /*
        Use case: bd connection
     */

    private static Singleton singleton = new Singleton();

    private String name;

    public static Singleton getInstance() {
        return singleton;
    }

    private Singleton() {
        name = "";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Singleton{" +
                "name='" + name + '\'' +
                '}';
    }
}
