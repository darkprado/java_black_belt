package main.multithreading;

import java.util.Properties;

/**
 * @author s.melekhin
 * @since 22 февр. 2022 г.
 */
public class WaitNotifyEx {

    public static void main(String[] args) {
        Market market = new Market();
        Producer producer = new Producer(market);
        Consumer consumer = new Consumer(market);
        Thread t1 = new Thread(producer);
        Thread t2 = new Thread(consumer);
        t1.start();
        t2.start();
    }
}

class Market {
    private int breadCount = 0;

    public synchronized void getBread() {
        while(breadCount < 1) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        breadCount--;
        System.out.println("Потребитель купил один хлеб");
        System.out.println("Количество хлеба в магазине " + breadCount);
        notify();
    }

    public synchronized void putBread() {
        while (breadCount >= 5) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        breadCount++;
        System.out.println("Производитель добавил на витрину один хлеб");
        System.out.println("Количество хлеба в магазине " + breadCount);
        notify();
    }
}

class Producer implements Runnable {

    Market market;

    public Producer(Market market) {
        this.market = market;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            market.putBread();
        }
    }
}

class Consumer implements Runnable {

    Market market;

    public Consumer(Market market) {
        this.market = market;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            market.getBread();
        }
    }
}
