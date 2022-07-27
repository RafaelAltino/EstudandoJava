import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

import javax.management.RuntimeErrorException;

public class Critico {
    public static void main(String[] args) throws Exception {
        
        Lock lock = new ReentrantLock();
        new Thread(
            () -> 
                hello(lock)
        ).start();

        Thread.sleep(1000);

        if(lock.tryLock(5, TimeUnit.SECONDS)){
            System.out.println("fazendo operacao critica");
            lock.unlock();
            System.out.println("concluiu operacao critica");
        } else{
            System.out.println("não foi possivel obter o lock");
        }

    }

    public static void hello(Lock lock){
        lock.lock();
        try{
            Thread.sleep(1000);
            System.out.println("hello");
        } catch(InterruptedException e){
            throw new RuntimeException(e);
        } finally{
            lock.unlock();
        }

    }
}
