package br.com.adrianorodrigues.executor;

import br.com.adrianorodrigues.interfaces.Executable;

import java.util.Date;

public class Executor {
    public static void execute(Executable executable) {
        System.out.println("---------------------------------------------------------");
        System.out.println(executable.getTitle());
        Date beginDate = new Date();
        executable.execute();
        Date endDate = new Date();
        System.out.println("---------------------------------------------------------");
        System.out.println("Time Elapsed: " + (endDate.getTime() - beginDate.getTime()) + " ms");
        System.out.println("---------------------------------------------------------");
    }
}
