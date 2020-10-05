package br.com.adrianorodrigues.designpatterns.structural.proxy;

import br.com.adrianorodrigues.interfaces.Executable;

public class ProxyExecutor implements Executable {
    @Override
    public String getTitle() {
        return "Proxy";
    }

    public void execute() {
        ExpensiveObject object = new ExpensiveObjectProxy();
        object.process();
        object.process();
    }
}
