package br.com.adrianorodrigues.solid.dependencyinversion.goodexample;

import java.util.logging.Logger;

public class Executor {
    /*
    This is a good example
    Because it depends on abstractions
    This code is easy to reuse and refactor
    It respects Inversion of Dependency Principle
     */
    public void execute(Executable executable) {
        Logger.getGlobal().info("executing executor");
        executable.execute();
    }

}
