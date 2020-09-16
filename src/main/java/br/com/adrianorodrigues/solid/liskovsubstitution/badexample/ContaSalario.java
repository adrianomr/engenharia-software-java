package br.com.adrianorodrigues.solid.liskovsubstitution.badexample;

public class ContaSalario extends ContaCorrenteComum {

    @Override
    public void rende() {
        throw new UnsupportedOperationException("Essa conta não possui rendimento");
    }

}