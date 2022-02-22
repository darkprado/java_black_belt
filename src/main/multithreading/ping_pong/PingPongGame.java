package main.multithreading.ping_pong;

/**
 * @author s.melekhin
 * @since 22 февр. 2022 г.
 */
public class PingPongGame {

    public static void main(String[] args) {
        Game game = new Game();
        Thread t1 = new Thread(new Pingable(game));
        Thread t2 = new Thread(new Pongable(game));
        t1.start();
        t2.start();
    }

}
