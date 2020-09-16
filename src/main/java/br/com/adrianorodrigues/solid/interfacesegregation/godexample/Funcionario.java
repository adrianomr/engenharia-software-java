package br.com.adrianorodrigues.solid.interfacesegregation.godexample;

public abstract class Funcionario implements Convencional {
    /*
        This is a bad example
        Because it breaks behavior into two interfaces
        To respect interface segregation principle
        more info: https://medium.com/@mari_azevedo/princ%C3%ADpios-s-o-l-i-d-o-que-s%C3%A3o-e-porque-projetos-devem-utiliz%C3%A1-los-bf496b82b299
         */
    private String nome;
    private double salario;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public double getSalario() {
        return this.salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
