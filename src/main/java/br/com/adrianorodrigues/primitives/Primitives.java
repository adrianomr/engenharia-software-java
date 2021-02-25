package br.com.adrianorodrigues.primitives;

import br.com.adrianorodrigues.executor.Executor;
import br.com.adrianorodrigues.interfaces.Executable;

import java.util.logging.Logger;

public class Primitives implements Executable {
    @Override
    public String getTitle() {
        return "EqualsAndHashCode";
    }

    @Override
    public void execute() {
        Integer number = null;
        Boolean bool = null;
        try {
            System.out.println(number == 5);
        } catch (NullPointerException e) {
            Logger.getGlobal().info("this should throw a null pointer exception");
        }
        try {
            System.out.println(bool == false);
        } catch (NullPointerException e) {
            Logger.getGlobal().info("this should throw a null pointer exception");
        }

        number = Integer.valueOf(5);
        bool = Boolean.FALSE;
        System.out.println(number == 5); // Result is ?
        System.out.println(bool == false); // Result is ?


    }

    public static void main(String[] args) {
        Executor.execute(new Primitives());
    }
}
