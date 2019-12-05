import br.com.adriano.singleton.Singleton;
import br.com.adriano.singleton.SingletonUseCase;
import br.com.br.com.adrianorodrigues.executor.Executor;

public class Main {
    public static void main(String[] args) {
        System.out.println("Design Patterns");
        Executor.execute(new SingletonUseCase());
    }
}
