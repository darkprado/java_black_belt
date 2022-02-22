package main.multithreading.ping_pong;

/**
 * @author s.melekhin
 * @since 22 февр. 2022 г.
 */
public class Game {

    private volatile boolean isPing = true;

    public synchronized void doPing() {
        while(!isPing) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        isPing = false;
        System.out.println("ping --->");
        notify();
    }

    public synchronized void doPong() {
        while (isPing) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        isPing = true;
        System.out.println("<--- pong");
        notify();
    }
}
