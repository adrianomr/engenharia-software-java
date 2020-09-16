package br.com.adrianorodrigues.solid.interfacesegregation.badexample;

public abstract class Funcionario {
    /*
    This is a bad example
    Because not all employees earn comission
    And if we keep building logic into this class
    It could became too fat
    So it's better to breake it into two or more interfaces
    To respect interface segregation principle
    more info: https://medium.com/@mari_azevedo/princ%C3%ADpios-s-o-l-i-d-o-que-s%C3%A3o-e-porque-projetos-devem-utiliz%C3%A1-los-bf496b82b299
     */
    private String nome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public abstract double getSalario();

    public abstract double getComissao();
}