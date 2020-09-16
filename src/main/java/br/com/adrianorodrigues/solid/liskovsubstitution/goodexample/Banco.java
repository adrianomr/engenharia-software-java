package br.com.adrianorodrigues.solid.liskovsubstitution.goodexample;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

public class Banco {
    public static void main(String[] args) {
        /*
        This is a good Example
        Because substituting inheritance by composition
        Makes clear that ContaSalario doesn't have a functional behavior
        to all methods in ContaCorrenteComum
        This prevents us of a occult exception thrown at runtime
        Respecting Liskov Principle where all subclasses must be
        substitutable by base class
        More info: https://medium.com/@mari_azevedo/princ%C3%ADpios-s-o-l-i-d-o-que-s%C3%A3o-e-porque-projetos-devem-utiliz%C3%A1-los-bf496b82b299
         */
        List<ContaCorrenteComum> listaDeContas = new ArrayList<>();
        listaDeContas.add(new ContaCorrenteComum());

        for (ContaCorrenteComum conta : listaDeContas) {
            conta.rende();

            Logger.getGlobal().info("Novo Saldo:\n" + conta.getSaldo());
        }
    }
}
