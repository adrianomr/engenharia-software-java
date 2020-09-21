import br.com.adrianorodrigues.algoritms.DijkstraShortestPathExecutor;
import br.com.adrianorodrigues.collections.ListVsSet;
import br.com.adrianorodrigues.executor.Executor;
import br.com.adrianorodrigues.singleton.SingletonExecutor;
import br.com.adrianorodrigues.stringbuilder.StringBuilderExecutor;
import br.com.adrianorodrigues.stringpool.StringPoolExecutor;

import java.util.logging.Logger;

public class Main {
    public static void main(String[] args) {
        Logger.getGlobal().info("Design Patterns");
        Executor.execute(new SingletonExecutor());
        Executor.execute(new DijkstraShortestPathExecutor());
        Executor.execute(new StringPoolExecutor());
        Executor.execute(new StringBuilderExecutor());
        Executor.execute(new ListVsSet());
    }
}
