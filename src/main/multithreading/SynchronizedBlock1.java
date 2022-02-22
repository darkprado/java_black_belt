package main.multithreading;

/**
 * @author s.melekhin
 * @since 22 февр. 2022 г.
 */
public class SynchronizedBlock1 {

    public static void main(String[] args) throws InterruptedException {
        Runnable run = new R2();
        Thread t1 = new Thread(run);
        Thread t2 = new Thread(run);
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println(Counter2.count);
    }
}

class Counter2 {
    volatile static int count = 0;
}

class R2 implements Runnable {

    private void doWork1() {
        doWork2();
        synchronized (this) {
            Counter2.count++;
            System.out.println(Counter2.count);
        }
    }

    private void doWork2() {
        System.out.println("!!!");
    }

    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
            doWork1();
        }
    }
}
