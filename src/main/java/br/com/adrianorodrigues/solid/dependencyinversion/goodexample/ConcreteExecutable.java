package br.com.adrianorodrigues.solid.dependencyinversion.goodexample;

import java.util.logging.Logger;

public class ConcreteExecutable implements Executable {

    public void execute() {
        Logger.getGlobal().info("Executing executable");
    }

}
