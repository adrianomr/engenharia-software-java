package br.com.adrianorodrigues.designpatterns.structural.proxy;

public class ExpensiveObjectProxy implements ExpensiveObject {
    private ExpensiveObject object;

    @Override
    public void process() {
        if (object == null) {
            object = new ExpensiveObjectImpl();
        }
        object.process();
    }
}
