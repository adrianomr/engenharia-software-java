package br.com.adrianorodrigues.stringpool;

import br.com.adrianorodrigues.interfaces.Executable;

public class StringPoolExecutor implements Executable {
    @Override
    public String getTitle() {
        return "String pool";
    }

    public void execute() {
        // when declared like this JVM returns a pointer to same string into string pool
        String adriano = "Adriano";
        String adrianoWithSameMemoryAddress = "Adriano";
        // when declared like this JVM creates and return a new a pointer to string
        String adrianoWithDiferenteMemoryAddres = "Adriano";
        System.out.println("Pointer to 'Adriano': " + System.identityHashCode(adriano));
        System.out.println("Same pointer to 'Adriano': " + System.identityHashCode(adrianoWithSameMemoryAddress));
        System.out.println("Different pointer to 'Adriano': " + System.identityHashCode(adrianoWithDiferenteMemoryAddres));
    }
}
