package main.generic;

/**
 * @author s.melekhin
 * @since 22 нояб. 2021 г.
 */
public class Info<T> {

    public static void main(String[] args) {
        Info<String> infoString = new Info<>("Hello");
        System.out.println(infoString);
        Info<Integer> infoInt = new Info<>(12);
        System.out.println(infoInt);
        String str = infoString.getValue();
        System.out.println(str);
    }

    private final T value;

    public Info(T value) {
        this.value = value;
    }

    public String toString() {
        return "{[" + value + "]}";
    }

    public T getValue() {
        return value;
    }

}
