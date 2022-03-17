package main.enums;

import java.util.Arrays;

/**
 * @author s.melekhin
 * @since 17 март 2022 г.
 */
public class Enum1 {

    public static void main(String[] args) {
        Today today = new Today(WeekDays.MONDAY);
        today.daysInfo();
        System.out.println(today.weekDays);
        WeekDays w1 = WeekDays.SUNDAY;
        WeekDays w2 = WeekDays.SUNDAY;
        WeekDays w3 = WeekDays.FRIDAY;
        WeekDays2 w4 = WeekDays2.SUNDAY;

        System.out.println(w1 == w2);
//        System.out.println(w1 == w4);
        System.out.println(w1.equals(w4));

        WeekDays w5 = WeekDays.valueOf("MONDAY");
        System.out.println(w5);

        WeekDays[] arr = WeekDays.values();
        System.out.println(Arrays.toString(arr));
    }
}

enum WeekDays {
    MONDAY("bad"),
    TUESDAY("bad"),
    WEDNESDAY("so-so"),
    THURSDAY,
    FRIDAY("good"),
    SATURDAY("great"),
    SUNDAY("good");

    private String mood;

    WeekDays(String mood) {
        this.mood = mood;
    }

    WeekDays() {
    }

    public String getMood() {
        return mood;
    }
}

enum WeekDays2 {
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY,
    SUNDAY;
}

class Today {

    WeekDays weekDays;

    public Today(WeekDays weekDays) {
        this.weekDays = weekDays;
    }

    void daysInfo() {
        switch (weekDays) {
            case MONDAY:
            case TUESDAY:
            case WEDNESDAY:
            case THURSDAY:
            case FRIDAY:
                System.out.println("job days");
                break;
            case SATURDAY:
            case SUNDAY:
                System.out.println("week ends");
                break;
        }
        System.out.println("Mood is " + weekDays.getMood());
    }
}