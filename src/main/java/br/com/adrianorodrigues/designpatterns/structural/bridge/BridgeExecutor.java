package br.com.adrianorodrigues.designpatterns.structural.bridge;

import br.com.adrianorodrigues.interfaces.Executable;

import java.util.logging.Logger;

public class BridgeExecutor implements Executable {
    @Override
    public String getTitle() {
        return "Singleton";
    }

    public void execute() {
        Shape square = new Square(new Blue());
        Logger.getGlobal().info(square.draw());
    }
}
