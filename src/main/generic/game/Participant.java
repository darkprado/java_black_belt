package main.generic.game;

/**
 * @author s.melekhin
 * @since 03 дек. 2021 г.
 */
public abstract class Participant {

    private String name;
    private int age;

    public Participant(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
