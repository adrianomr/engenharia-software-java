package br.com.adrianorodrigues.util.timer;

public class Timer {

    private long tempoInicial;

    public void startTimer() {
        tempoInicial = System.currentTimeMillis();
    }

    public long finishTimer() {
        return System.currentTimeMillis() - tempoInicial;
    }
}
