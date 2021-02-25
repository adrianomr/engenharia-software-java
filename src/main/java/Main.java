import br.com.adrianorodrigues.algoritms.DijkstraShortestPathExecutor;
import br.com.adrianorodrigues.collections.ListVsSet;
import br.com.adrianorodrigues.designpatterns.creational.abstractfactory.AbstractFactoryExecutor;
import br.com.adrianorodrigues.designpatterns.creational.builder.BuilderExecutor;
import br.com.adrianorodrigues.designpatterns.creational.factory.FactoryExecutor;
import br.com.adrianorodrigues.designpatterns.creational.singleton.SingletonExecutor;
import br.com.adrianorodrigues.designpatterns.structural.adapter.AdapterExecutor;
import br.com.adrianorodrigues.designpatterns.structural.bridge.BridgeExecutor;
import br.com.adrianorodrigues.designpatterns.structural.decorator.DecoratorExecutor;
import br.com.adrianorodrigues.designpatterns.structural.proxy.ProxyExecutor;
import br.com.adrianorodrigues.executor.Executor;
import br.com.adrianorodrigues.objects.EqualsAndHashCode;
import br.com.adrianorodrigues.stringbuilder.StringBuilderExecutor;
import br.com.adrianorodrigues.stringpool.StringPoolExecutor;

import java.util.logging.Logger;

public class Main {
    public static void main(String[] args) {
        Logger.getGlobal().info("Design Patterns");
        Logger.getGlobal().info("Creational Design Patterns");
        Executor.execute(new SingletonExecutor());
        Executor.execute(new FactoryExecutor());
        Executor.execute(new AbstractFactoryExecutor());
        Executor.execute(new BuilderExecutor());
        Logger.getGlobal().info("Structural Design Patterns");
        Executor.execute(new ProxyExecutor());
        Executor.execute(new DecoratorExecutor());
        Executor.execute(new AdapterExecutor());
        Executor.execute(new BridgeExecutor());
        Logger.getGlobal().info("Algorithms");
        Executor.execute(new DijkstraShortestPathExecutor());
        Logger.getGlobal().info("String");
        Executor.execute(new StringPoolExecutor());
        Executor.execute(new StringBuilderExecutor());
        Logger.getGlobal().info("Collections");
        Executor.execute(new ListVsSet());
        Logger.getGlobal().info("Objects");
        Executor.execute(new EqualsAndHashCode());
    }
}
