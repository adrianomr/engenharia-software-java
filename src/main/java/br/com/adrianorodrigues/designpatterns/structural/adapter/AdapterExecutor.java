package br.com.adrianorodrigues.designpatterns.structural.adapter;

import br.com.adrianorodrigues.interfaces.Executable;

import java.util.logging.Logger;

public class AdapterExecutor implements Executable {
    @Override
    public String getTitle() {
        return "Adapter";
    }

    public void execute() {
        Movable bugattiVeyron = new BugattiVeyron();
        MovableAdapter bugattiVeyronAdapter = new MovableAdapterImpl(bugattiVeyron);
        Logger.getGlobal().info("Speed in m/h: " + bugattiVeyron.getSpeed());
        Logger.getGlobal().info("Speed in km/h: " + bugattiVeyronAdapter.getSpeed());
    }
}
