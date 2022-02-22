package main.multithreading;

/**
 * @author s.melekhin
 * @since 22 февр. 2022 г.
 */
public class DeadLockEx {

    public static final Object lock1 = new Object();
    public static final Object lock2 = new Object();

    public static void main(String[] args) {
        Th1 t1 = new Th1();
        Th2 t2 = new Th2();
        t1.start();
        t2.start();
    }

}

class Th1 extends Thread {
    @Override
    public void run() {
        System.out.println("Th1: попытка захватить монитор lock1");
        synchronized (DeadLockEx.lock1) {
            System.out.println("Th1: lock1 захвачен");
            System.out.println("Th1: попытка захватить монитор lock2");
            synchronized (DeadLockEx.lock2) {
                System.out.println("Th1: lock1 и lock2 захвачены");
            }
        }
    }
}

class Th2 extends Thread {
    @Override
    public void run() {
        System.out.println("Th2: попытка захватить монитор lock2");
        synchronized (DeadLockEx.lock2) {
            System.out.println("Th2: lock2 захвачен");
            System.out.println("Th2: попытка захватить монитор lock1");
            synchronized (DeadLockEx.lock1) {
                System.out.println("Th2: lock1 и lock2 захвачены");
            }
        }
    }
}
