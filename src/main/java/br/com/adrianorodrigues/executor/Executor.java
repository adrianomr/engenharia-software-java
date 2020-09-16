package br.com.adrianorodrigues.executor;

import br.com.adrianorodrigues.interfaces.Executable;
import br.com.adrianorodrigues.util.timer.Timer;

public class Executor {
    public static void execute(Executable executable) {
        Timer timer = new Timer();
        System.out.println("---------------------------------------------------------");
        System.out.println(executable.getTitle());
        timer.startTimer();
        executable.execute();
        long elapsedTime = timer.finishTimer();
        System.out.println("---------------------------------------------------------");
        System.out.println("Time Elapsed: " + elapsedTime + " ms");
        System.out.println("---------------------------------------------------------");
    }
}
