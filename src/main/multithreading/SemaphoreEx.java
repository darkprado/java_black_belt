package main.multithreading;

import java.util.concurrent.Semaphore;

/**
 * @author s.melekhin
 * @since 04 март 2022 г.
 */
public class SemaphoreEx {

    public static void main(String[] args) {
        Semaphore callBox = new Semaphore(2);
        new Person("Stanislav", callBox);
        new Person("Elena", callBox);
        new Person("Oleg", callBox);
        new Person("Marina", callBox);
        new Person("Ivan", callBox);
    }

}

class Person extends Thread {

    String name;
    private Semaphore callBox;

    public Person(String name, Semaphore callBox) {
        this.name = name;
        this.callBox = callBox;
        start();
    }

    @Override
    public void run() {
        try {
            System.out.println(name + " wait...");
            callBox.acquire();
            System.out.println(name + " use phone");
            sleep(2000);
            System.out.println(name + " ends call");
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            callBox.release();
        }
    }
}
