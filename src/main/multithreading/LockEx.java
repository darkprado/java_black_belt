package main.multithreading;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author s.melekhin
 * @since 22 февр. 2022 г.
 */
public class LockEx {

    public static void main(String[] args) {
        Call call = new Call();
        new Thread(new Runnable() {
            @Override
            public void run() {
                call.mobileCall();
            }
        }).start();
        new Thread(call::skypeCall).start();
        new Thread(() -> call.whatsAppCall()).start();
    }
}

class Call {
    private Lock lock = new ReentrantLock();

    void mobileCall() {
        lock.lock();
        try {
            System.out.println("Mobile call starts");
            Thread.sleep(3000);
            System.out.println("Mobile call ends");
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }

    void skypeCall() {
        lock.lock();
        try {
            System.out.println("Skype call starts");
            Thread.sleep(5000);
            System.out.println("Skype call ends");
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }

    void whatsAppCall() {
        lock.lock();
        try {
            System.out.println("whatsApp call starts");
            Thread.sleep(7000);
            System.out.println("whatsApp call ends");
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }
}