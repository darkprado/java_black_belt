package main.multithreading;

/**
 * @author s.melekhin
 * @since 01 март 2022 г.
 */
public class InterruptionEx {

    public static void main(String[] args) throws InterruptedException {
        System.out.println("Main thread starts");
        InterruptedThread interruptedThread = new InterruptedThread();
        interruptedThread.start();
        Thread.sleep(2000);
        interruptedThread.interrupt();
        interruptedThread.join();
        System.out.println("Main thread ends");
    }

}

class InterruptedThread extends Thread {

    double sqrtSum = 0;

    @Override
    public void run() {
        for (int i = 1; i < 1_000_000_000; i++) {
            if (isInterrupted()) {
                System.out.println("Has interrupt");
                System.out.println(sqrtSum);
                return;
            }
            sqrtSum += Math.sqrt(i);
            try {
                sleep(100);
            } catch (InterruptedException e) {
                System.out.println("interrupt with sleep");
                System.out.println(sqrtSum);
                return;
            }
        }
        System.out.println(sqrtSum);
    }
}