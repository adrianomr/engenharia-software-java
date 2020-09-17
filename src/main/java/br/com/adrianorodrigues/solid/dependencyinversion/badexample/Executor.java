package br.com.adrianorodrigues.solid.dependencyinversion.badexample;

import java.util.logging.Logger;

public class Executor {
    /*
    This is a baad example
    Because it depends on concretions.
    This code is hard to reuse and refactor
    It breaks Inversion of Dependency Principle
     */
    public void execute(Executable executable) {
        Logger.getGlobal().info("executing executor");
        executable.execute();
    }

}
