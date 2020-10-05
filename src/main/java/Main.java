import br.com.adrianorodrigues.algoritms.DijkstraShortestPathExecutor;
import br.com.adrianorodrigues.collections.ListVsSet;
import br.com.adrianorodrigues.designpatterns.abstractfactory.AbstractFactoryExecutor;
import br.com.adrianorodrigues.designpatterns.builder.BuilderExecutor;
import br.com.adrianorodrigues.designpatterns.factory.FactoryExecutor;
import br.com.adrianorodrigues.designpatterns.singleton.SingletonExecutor;
import br.com.adrianorodrigues.executor.Executor;
import br.com.adrianorodrigues.stringbuilder.StringBuilderExecutor;
import br.com.adrianorodrigues.stringpool.StringPoolExecutor;

import java.util.logging.Logger;

public class Main {
    public static void main(String[] args) {
        Logger.getGlobal().info("Design Patterns");
        Executor.execute(new SingletonExecutor());
        Executor.execute(new FactoryExecutor());
        Executor.execute(new AbstractFactoryExecutor());
        Executor.execute(new BuilderExecutor());
        Logger.getGlobal().info("Algorithms");
        Executor.execute(new DijkstraShortestPathExecutor());
        Logger.getGlobal().info("String");
        Executor.execute(new StringPoolExecutor());
        Executor.execute(new StringBuilderExecutor());
        Logger.getGlobal().info("Collections");
        Executor.execute(new ListVsSet());
    }
}
