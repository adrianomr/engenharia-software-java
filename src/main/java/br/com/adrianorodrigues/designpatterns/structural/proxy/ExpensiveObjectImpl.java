package br.com.adrianorodrigues.designpatterns.structural.proxy;

import java.util.logging.Logger;

public class ExpensiveObjectImpl implements ExpensiveObject {

    public ExpensiveObjectImpl() {
        heavyInitialConfiguration();
    }

    @Override
    public void process() {
        Logger.getGlobal().info("processing complete.");
    }

    private void heavyInitialConfiguration() {
        Logger.getGlobal().info("Loading initial configuration...");
    }

}
