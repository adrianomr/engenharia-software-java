package br.com.adrianorodrigues.designpatterns.factory;

import br.com.adrianorodrigues.interfaces.Executable;

import java.util.logging.Logger;

public class FactoryExecutor implements Executable {
    @Override
    public String getTitle() {
        return "Factory";
    }

    public void execute() {
        PolygonFactory polygonFactory = new PolygonFactory();
        Logger.getGlobal().info(polygonFactory
                .getPolygon(3)
                .getType());
        Logger.getGlobal().info(polygonFactory
                .getPolygon(4)
                .getType());
        Logger.getGlobal().info(polygonFactory
                .getPolygon(5)
                .getType());
    }
}
