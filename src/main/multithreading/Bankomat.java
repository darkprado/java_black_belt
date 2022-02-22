package main.multithreading;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author s.melekhin
 * @since 22 февр. 2022 г.
 */
public class Bankomat {

    public static void main(String[] args) {
        Lock lock = new ReentrantLock();
        new Man("Stanislav", lock);
        new Man("Oleg", lock);
        new Man("Ivan", lock);
        new Man("Egor", lock);
        new Man("Sergey", lock);
    }

}

class Man extends Thread {

    private String name;
    private Lock lock;

    public Man(String name, Lock lock) {
        this.name = name;
        this.lock = lock;
        this.start();
    }

    @Override
    public void run() {
        if (lock.tryLock()) {
            try {
//                System.out.println(name + " wait");
//                lock.lock();
                System.out.println(name + " use bankomat");
                Thread.sleep(2000);
                System.out.println(name + " end work with bsnkomat");
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                lock.unlock();
            }
        } else {
            System.out.println(name + " go out");
        }
    }
}