package br.com.adrianorodrigues.solid.liskovsubstitution.goodexample;

public class ContaSalario {

    private final GerenciadorDeContas gerenciador;

    public ContaSalario() {
        this.gerenciador = new GerenciadorDeContas();
    }

    public void deposita(double valor) {
        this.gerenciador.deposita(valor);
    }

    public void saca(double valor) {
        this.gerenciador.saca(valor);
    }

    public double getSaldo() {
        return this.gerenciador.getSaldo();
    }

    @Override
    public String toString() {
        return "Saldo conta salario-> " + this.getSaldo();
    }
}