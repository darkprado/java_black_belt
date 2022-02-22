package main.multithreading.ping_pong;

/**
 * @author s.melekhin
 * @since 22 февр. 2022 г.
 */
public class Pongable  implements Runnable {

    Game game;

    public Pongable(Game game) {
        this.game = game;
    }

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            game.doPong();
        }
    }
}