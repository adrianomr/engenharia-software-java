package br.com.adrianorodrigues.executor;

import br.com.adrianorodrigues.interfaces.Executable;
import br.com.adrianorodrigues.util.timer.Timer;

import java.util.logging.Logger;

public class Executor {

    public static final String MSG = "---------------------------------------------------------";

    private Executor() {

    }

    public static void execute(Executable executable) {
        Timer timer = new Timer();
        Logger.getGlobal().info(MSG);
        Logger.getGlobal().info(executable.getTitle());
        timer.startTimer();
        executable.execute();
        long elapsedTime = timer.finishTimer();
        Logger.getGlobal().info(MSG);
        Logger.getGlobal().info("Time Elapsed: " + elapsedTime + " ms");
        Logger.getGlobal().info(MSG);
    }
}
