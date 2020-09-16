package br.com.adrianorodrigues.solid.liskovsubstitution.badexample;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

public class Banco {
    public static void main(String[] args) {
        /*
        This is a bad example
        Because it's not clear that ContaSalario doesn't have a functional behavior
        to all methods in ContaCorrenteComum
        So, it cant substitute ContaSalario
        That is going to cause a occult runtime excetion
        This disrespect Liskov Principle where all subclasses must be
        substitutable by base class
        More info: https://medium.com/@mari_azevedo/princ%C3%ADpios-s-o-l-i-d-o-que-s%C3%A3o-e-porque-projetos-devem-utiliz%C3%A1-los-bf496b82b299
         */

        List<ContaCorrenteComum> listaDeContas = new ArrayList<>();
        listaDeContas.add(new ContaCorrenteComum());
        listaDeContas.add(new ContaSalario());

        for (ContaCorrenteComum conta : listaDeContas) {
            conta.rende();
            Logger.getGlobal().info("Novo Saldo:\n" + conta.getSaldo());
        }
    }
}
