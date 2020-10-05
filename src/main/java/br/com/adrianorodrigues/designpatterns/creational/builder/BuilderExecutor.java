package br.com.adrianorodrigues.designpatterns.creational.builder;

import br.com.adrianorodrigues.interfaces.Executable;

import java.util.logging.Logger;

public class BuilderExecutor implements Executable {
    @Override
    public String getTitle() {
        return "Builder";
    }

    public void execute() {
        BankAccount newAccount = new BankAccount
                .BankAccountBuilder("Jon", "22738022275")
                .withEmail("jon@example.com")
                .wantNewsletter(true)
                .build();
        Logger.getGlobal().info(newAccount.toString());
    }
}
