package main.multithreading;

/**
 * @author s.melekhin
 * @since 01 март 2022 г.
 */
public class DeamonEx {

    public static void main(String[] args) {
        System.out.println("Main thread starts");
        UserThread userThread = new UserThread();
        userThread.setName("user_thread");
        DeamonThread deamonThread = new DeamonThread();
        deamonThread.setName("deamon_thread");
        deamonThread.setDaemon(true);
        userThread.start();
        deamonThread.start();
        System.out.println("Main thread ends");
    }
}

class UserThread extends Thread {

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " is deamon: " + isDaemon());
        for (char i = 'A'; i <= 'J'; i++) {
            try {
                sleep(300);
                System.out.println(i);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class DeamonThread extends Thread {

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " is deamon: " + isDaemon());
        for (int i = 1; i <= 1000; i++) {
            try {
                sleep(100);
                System.out.println(i);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}