package main.multithreading;

/**
 * @author s.melekhin
 * @since 22 февр. 2022 г.
 */
public class Ex4 {

    public static void main(String[] args) {
        MyThread5 thread5 = new MyThread5();
        System.out.println("Name of thread5 = " + thread5.getName() + ", priority = " + thread5.getPriority());
        MyThread5 thread6 = new MyThread5();
        thread6.setName("My thread");
        thread6.setPriority(Thread.MAX_PRIORITY);
        System.out.println("Name of thread6 = " + thread6.getName() + ", priority = " + thread6.getPriority());
    }
}

class MyThread5 extends Thread {

    @Override
    public void run() {
        System.out.println("Hello");
    }
}