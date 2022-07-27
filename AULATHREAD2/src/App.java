import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class App {
    public static void main(String[] args) throws InterruptedException, Exception {
        
        TaskRandomNumber task = new TaskRandomNumber();
        ExecutorService service = Executors.newSingleThreadExecutor();
        Future<Integer> future = service.submit(task);

        service.submit( task );

        while (!future.isDone()){
            Thread.sleep(100);
            System.out.println("aguardando...");
        }

        // Executar alguma regra

        System.out.println("numero gerado: " + future.get());
        service.shutdown();
        
    }

    static class TaskRandomNumber implements Callable<Integer>{
        @Override
        public Integer call() throws Exception {
            Thread.sleep(2000);
            return new Random().nextInt();
        }
    }
}
