package br.com.adrianorodrigues.solid.singleresponsability;

import br.com.adrianorodrigues.interfaces.Executable;
import br.com.adrianorodrigues.util.timer.Timer;

public class SingleResponsabilityExecutor implements Executable {
    // Artigo para leitura: https://www.devmedia.com.br/diferencas-entre-string-stringbuilder-e-stringbuffer-em-java/29865
    @Override
    public String getTitle() {
        return "String Builder";
    }

    public void execute() {
        Timer timer = new Timer();
        long elapsedTimer;
        int size = 10000;
        timer.startTimer();
        stringBuilderLoop(size);
        elapsedTimer = timer.finishTimer();
        System.out.println("Looping using string builder: " + elapsedTimer);
        timer.startTimer();
        concatLoop(size);
        elapsedTimer = timer.finishTimer();
        System.out.println("Looping using concat: " + elapsedTimer);
    }

    public String stringBuilderLoop(int size) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < size; i++)
            stringBuilder.append("Adriano\n");
        return stringBuilder.toString();
    }

    public String concatLoop(int size) {
        String string = "";
        for (int i = 0; i < size; i++)
            string = string.concat("Adriano\n");
        return string;
    }

}
