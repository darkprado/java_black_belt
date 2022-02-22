package main.multithreading;

/**
 * @author s.melekhin
 * @since 22 февр. 2022 г.
 */
public class VolatileEx extends Thread {

    volatile boolean b = true;

    @Override
    public void run() {
        long counter = 0;
        while (b) {
            counter++;
        }
        System.out.println("loop finish, counter = " + counter);
    }

    public static void main(String[] args) throws InterruptedException {
        VolatileEx thread = new VolatileEx();
        thread.start();
        Thread.sleep(3000);
        System.out.println("After 3 seconds wake up!");
        thread.b = false;
        thread.join();
        System.out.println("end");
    }
}
