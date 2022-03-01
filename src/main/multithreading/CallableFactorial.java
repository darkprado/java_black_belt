package main.multithreading;

import java.util.concurrent.*;

/**
 * @author s.melekhin
 * @since 01 март 2022 г.
 */
public class CallableFactorial {

    static int factorialResult;

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        Factorial2 factorial2 = new Factorial2(6);
        Future<Integer> future = executorService.submit(factorial2);
        try {
            System.out.println(future.isDone());
            System.out.println("getting resultat");
            factorialResult = future.get();
            System.out.println("result get");
            System.out.println(future.isDone());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            System.out.println(e.getCause());
        } finally {
            executorService.shutdown();
        }
        System.out.println(factorialResult);
    }

}

class Factorial2 implements Callable<Integer> {

    int f;

    public Factorial2(int f) {
        this.f = f;
    }

    @Override
    public Integer call() throws Exception {
        if (f <= 0) {
            throw new Exception("Неверное число");
        }
        int result = 1;
        for (int i = 1; i <= f; i++) {
            result *= i;
            Thread.sleep(1000);
        }
        return result;
    }
}