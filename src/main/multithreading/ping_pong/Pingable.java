package main.multithreading.ping_pong;

/**
 * @author s.melekhin
 * @since 22 февр. 2022 г.
 */
public class Pingable implements Runnable {

    Game game;

    public Pingable(Game game) {
        this.game = game;
    }

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            game.doPing();
        }
    }
}