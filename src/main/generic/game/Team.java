package main.generic.game;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * @author s.melekhin
 * @since 03 дек. 2021 г.
 */
public class Team<T extends Participant> {

    private final String name;
    private final List<T> participants = new ArrayList<>();

    public Team(String name) {
        this.name = name;
    }

    public void addNewParticipant(T participant) {
        participants.add(participant);
        System.out.printf("В команду %s был добавлен участник с именем %s%n", name, participant.getName());
    }

    public void playWith(Team<T> team) {
        String winnerName;
        Random random = new Random();
        int i = random.nextInt(2);
        if (i == 0) {
            winnerName = name;
        } else {
            winnerName = team.name;
        }
        System.out.printf("Выиграла комманда %s", winnerName);
    }

}
