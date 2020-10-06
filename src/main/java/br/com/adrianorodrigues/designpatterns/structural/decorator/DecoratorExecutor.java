package br.com.adrianorodrigues.designpatterns.structural.decorator;

import br.com.adrianorodrigues.interfaces.Executable;

import java.util.logging.Logger;

public class DecoratorExecutor implements Executable {
    @Override
    public String getTitle() {
        return "Decorator";
    }

    public void execute() {
        ChristmasTree tree2 = new BubbleLights(
                new Garland(new Garland(new ChristmasTreeImpl())));
        Logger.getGlobal().info(tree2.decorate());
    }
}
