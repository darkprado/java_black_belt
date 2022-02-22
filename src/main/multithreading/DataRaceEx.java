package main.multithreading;

/**
 * @author s.melekhin
 * @since 22 февр. 2022 г.
 */
public class DataRaceEx {

    public static void main(String[] args) {
        MyRunDataRace runDataRace = new MyRunDataRace();
        Thread thread1 = new Thread(runDataRace);
        Thread thread2 = new Thread(runDataRace);
        Thread thread3 = new Thread(runDataRace);
        thread1.start();
        thread2.start();
        thread3.start();
    }
}

class Counter {
    static int count = 0;
}

class MyRunDataRace implements Runnable {

    public void increment() {
        Counter.count++;
        System.out.print(Counter.count + " ");
    }

    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
            increment();
        }
    }
}