package br.com.adrianorodrigues.stringpool;

import br.com.adrianorodrigues.interfaces.Executable;

import java.util.logging.Logger;

public class StringPoolExecutor implements Executable {

    public static final String ADRIANO = "Adriano";

    @Override
    public String getTitle() {
        return "String pool";
    }

    public void execute() {
        // when declared like this JVM returns a pointer to same string into string pool
        String adriano = ADRIANO;
        String adrianoWithSameMemoryAddress = ADRIANO;
        // when declared like this JVM creates and return a new a pointer to string
        String adrianoWithDiferenteMemoryAddres = ADRIANO;
        Logger.getGlobal().info("Pointer to 'Adriano': " + System.identityHashCode(adriano));
        Logger.getGlobal().info("Same pointer to 'Adriano': " + System.identityHashCode(adrianoWithSameMemoryAddress));
        Logger.getGlobal().info("Different pointer to 'Adriano': " + System.identityHashCode(adrianoWithDiferenteMemoryAddres));
    }
}
