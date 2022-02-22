package main.multithreading;

/**
 * @author s.melekhin
 * @since 22 февр. 2022 г.
 */
public class SynchObj {

    static final Object lock = new Object();

    void mobileCall() {
        synchronized (lock) {
            System.out.println("Mobile call starts");
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Mobile call ends");
        }
    }

    void skypeCall() {
        synchronized (lock) {
            System.out.println("Skype call starts");
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Skype call ends");
        }
    }

    void whatsAppCall() {
        synchronized (lock) {
            System.out.println("WhatsApp call starts");
            try {
                Thread.sleep(7000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("WhatsApp call ends");
        }
    }

    public static void main(String[] args) {
        Thread t1 = new Thread(new MobileCall());
        Thread t2 = new Thread(new SkypeCall());
        Thread t3 = new Thread(new WhatsAppCall());
        t1.start();
        t2.start();
        t3.start();
    }
}

class MobileCall implements Runnable {

    @Override
    public void run() {
        new SynchObj().mobileCall();
    }
}

class SkypeCall implements Runnable {

    @Override
    public void run() {
        new SynchObj().skypeCall();
    }
}

class WhatsAppCall implements Runnable {

    @Override
    public void run() {
        new SynchObj().whatsAppCall();
    }
}