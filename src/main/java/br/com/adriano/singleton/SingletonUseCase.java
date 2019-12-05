package br.com.adriano.singleton;

import br.com.adrianorodrigues.interfaces.Executable;

public class SingletonUseCase implements Executable {
    @Override
    public String getTitle() {
        return "Singleton";
    }

    public void execute() {
        Singleton singletonInstace = Singleton.getInstance();
        singletonInstace.setName("Adriano");
        Singleton singletonNewInstace = Singleton.getInstance();
        System.out.println(singletonInstace.toString());
        System.out.println(singletonNewInstace.toString());
        singletonInstace.setName("Adriano Rodrigues");
        System.out.println(singletonInstace.toString());
        System.out.println(singletonNewInstace.toString());
    }
}
