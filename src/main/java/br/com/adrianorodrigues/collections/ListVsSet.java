package br.com.adrianorodrigues.collections;

import br.com.adrianorodrigues.interfaces.Executable;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.logging.Logger;

public class ListVsSet implements Executable {

    @Override
    public String getTitle() {
        return "List VS Set";
    }

    @Override
    public void execute() {
        List<String> pessoaList = new ArrayList<>();
        Set<String> pessoaSet = new LinkedHashSet<>();
        String adriano = "Adriano";
        String pedro = "Pedro";
        String paulo = "Paulo";
        String adrianoRepetido = "Adriano";
        pessoaList.add(adriano);
        pessoaList.add(pedro);
        pessoaList.add(paulo);
        pessoaList.add(adrianoRepetido);
        pessoaSet.add(adriano);
        pessoaSet.add(pedro);
        pessoaSet.add(paulo);
        pessoaSet.add(adrianoRepetido);
        Logger.getGlobal().info("List: ");
        Logger.getGlobal().info(pessoaList.toString());
        Logger.getGlobal().info("Set: ");
        Logger.getGlobal().info(pessoaSet.toString());
    }
}
