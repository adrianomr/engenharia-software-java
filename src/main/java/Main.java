import br.com.adrianorodrigues.algoritms.DijkstraShortestPathExecutor;
import br.com.adrianorodrigues.executor.Executor;
import br.com.adrianorodrigues.singleton.SingletonExecutor;

public class Main {
    public static void main(String[] args) {
        System.out.println("Design Patterns");
        Executor.execute(new SingletonExecutor());
        Executor.execute(new DijkstraShortestPathExecutor());
    }
}
