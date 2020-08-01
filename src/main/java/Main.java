import br.com.adrianorodrigues.executor.Executor;
import br.com.adrianorodrigues.singleton.SingletonUseCase;

public class Main {
    public static void main(String[] args) {
        System.out.println("Design Patterns");
        Executor.execute(new SingletonUseCase());
    }
}
