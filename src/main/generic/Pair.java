package main.generic;

/**
 * @author s.melekhin
 * @since 22 нояб. 2021 г.
 */
public class Pair<V1, V2> {

    public static void main(String[] args) {
        Pair<String, Integer> pair1 = new Pair<>("Hello", 12);
        System.out.println(pair1.getFirstValue());
        System.out.println(pair1.getSecondValue());
    }

    private final V1 value1;
    private final V2 value2;

    public Pair(V1 value1, V2 value2) {
        this.value1 = value1;
        this.value2 = value2;
    }

    public V1 getFirstValue() {
        return value1;
    }

    public V2 getSecondValue() {
        return value2;
    }

}
