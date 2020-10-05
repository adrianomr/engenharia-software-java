package br.com.adrianorodrigues.designpatterns.creational.singleton;

import br.com.adrianorodrigues.interfaces.Executable;

import java.util.logging.Logger;

public class SingletonExecutor implements Executable {
    @Override
    public String getTitle() {
        return "Singleton";
    }

    public void execute() {
        Singleton singletonInstace = Singleton.getInstance();
        singletonInstace.setName("Adriano");
        Singleton singletonNewInstace = Singleton.getInstance();
        Logger.getGlobal().info(singletonInstace.toString());
        Logger.getGlobal().info(singletonNewInstace.toString());
        singletonInstace.setName("Adriano Rodrigues");
        Logger.getGlobal().info(singletonInstace.toString());
        Logger.getGlobal().info(singletonNewInstace.toString());
    }
}
