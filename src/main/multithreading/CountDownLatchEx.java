package main.multithreading;

import java.util.concurrent.CountDownLatch;

/**
 * @author s.melekhin
 * @since 04 март 2022 г.
 */
public class CountDownLatchEx {

    static CountDownLatch countDownLatch = new CountDownLatch(3);

    private static void marketStaffIsOnPlace() throws InterruptedException {
        Thread.sleep(2000);
        System.out.println("Market staff came to work");
        countDownLatch.countDown();
        System.out.println(countDownLatch.getCount());
    }

    private static void everythinkIsReady() throws InterruptedException {
        Thread.sleep(3000);
        System.out.println("Everythink is ready");
        countDownLatch.countDown();
        System.out.println(countDownLatch.getCount());
    }

    private static void openMarket() throws InterruptedException {
        Thread.sleep(4000);
        System.out.println("Market opened");
        countDownLatch.countDown();
        System.out.println(countDownLatch.getCount());
    }

    public static void main(String[] args) throws InterruptedException {
        new Friend("Stanislav", countDownLatch);
        new Friend("Oleg", countDownLatch);
        new Friend("Ivan", countDownLatch);
        new Friend("Elena", countDownLatch);
        new Friend("Egor", countDownLatch);

        marketStaffIsOnPlace();
        everythinkIsReady();
        openMarket();
    }

}

class Friend extends Thread {

    String name;
    CountDownLatch countDownLatch;

    public Friend(String name, CountDownLatch countDownLatch) {
        this.name = name;
        this.countDownLatch = countDownLatch;
        start();
    }

    @Override
    public void run() {
        try {
            countDownLatch.await();
            System.out.println(name + " go market");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}