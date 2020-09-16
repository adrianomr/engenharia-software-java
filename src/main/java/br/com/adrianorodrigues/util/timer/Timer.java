package br.com.adrianorodrigues.util.timer;

public class Timer {

    private long tempoInicial, tempoFinal;

    public void startTimer() {
        tempoInicial = System.currentTimeMillis();
    }

    public long finishTimer() {
        tempoFinal = System.currentTimeMillis();
        return tempoFinal - tempoInicial;
    }
}
