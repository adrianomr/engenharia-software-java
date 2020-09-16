package br.com.adrianorodrigues.solid.interfacesegregation.badexample;


public class Vendedor extends Funcionario {

    private final double salario;
    private final int totalVendas;

    public Vendedor(double salario, int totalVendas) {
        this.salario = salario;
        this.totalVendas = totalVendas;
    }

    @Override
    public double getSalario() {
        return this.salario + this.getComissao();
    }

    @Override
    public double getComissao() {
        return this.totalVendas * 0.2;
    }

}