package br.com.adrianorodrigues.objects;

import br.com.adrianorodrigues.executor.Executor;
import br.com.adrianorodrigues.interfaces.Executable;

import java.util.Objects;
import java.util.logging.Logger;

public class EqualsAndHashCode implements Executable {
    @Override
    public String getTitle() {
        return "EqualsAndHashCode";
    }

    @lombok.EqualsAndHashCode
    private class SuperClass {
        String field1;

        public SuperClass(String field1) {
            this.field1 = field1;
        }
    }

    @lombok.EqualsAndHashCode(callSuper = true)
    private class SubClass extends SuperClass {
        String field2;

        public SubClass(String field1, String field2) {
            super(field1);
            this.field2 = field2;
        }
    }

    @Override
    public void execute() {
        SuperClass superClass1 = new SuperClass("");
        SuperClass superClass2 = new SuperClass("");
        SubClass subClass1 = new SubClass("", "");
        SubClass subClass2 = new SubClass("", "");
        SubClass subClass3 = new SubClass("", "a");
        SubClass subClass4 = new SubClass("", "");
        SubClass subClass5 = new SubClass("a", "");
        SubClass subClass6 = new SubClass("", "");
        Logger.getGlobal().info("object1 should be equals to object2: " + (superClass1.equals(superClass2)));
        Logger.getGlobal().info("object1 should be equals to object2: " + (subClass1.equals(subClass2)));
        Logger.getGlobal().info("object3 should not be equals to object4: " + (subClass3.equals(subClass4)));
        Logger.getGlobal().info("object5 should not be equals to object6: " + (subClass5.equals(subClass6)));
    }

    public static void main(String[] args) {
        Executor.execute(new EqualsAndHashCode());
    }
}
