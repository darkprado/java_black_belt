package main.multithreading;

/**
 * @author s.melekhin
 * @since 22 февр. 2022 г.
 */
public class DataRaceEx2 {

    volatile static int counter = 0;

    public static synchronized void increment() {
        counter++;
    }

    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(new R());
        Thread t2 = new Thread(new R());
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println(counter);
    }
}

class R implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            DataRaceEx2.increment();
        }
    }
}
