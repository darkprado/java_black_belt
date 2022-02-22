package main.multithreading;

/**
 * @author s.melekhin
 * @since 22 февр. 2022 г.
 */
public class Ex6 extends Thread {

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + " " + i);
        }
    }


    public static void main(String[] args) throws InterruptedException {
        Thread thread1 = new Thread(new MyRun1());
        Ex6 thread2 = new Ex6();
        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();
        System.out.println("end");
    }
}

class MyRun1 implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + " " + i);
        }
    }
}