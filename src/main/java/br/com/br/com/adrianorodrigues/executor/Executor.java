package br.com.br.com.adrianorodrigues.executor;

import br.com.adrianorodrigues.interfaces.Executable;

public class Executor {
    public static void execute(Executable executable){
        System.out.println("---------------------------------------------------------");
        System.out.println(executable.getTitle());
        executable.execute();
        System.out.println("---------------------------------------------------------");
    }
}
