package main.generic;

/**
 * @author s.melekhin
 * @since 24 нояб. 2021 г.
 */
public class SubTypes {

    public static void main(String[] args) {
        System.out.println(new Info2<Integer>(12));
        System.out.println(new Info2<Double>(12.2));

        System.out.println(new MyNumber<>("asd", 12));
        System.out.println(new MyNumber<>("vbn", 12.2));
    }

}

class Info2<T extends Number> {

    private final T value;

    public Info2(T value) {
        this.value = value;
    }

    public String toString() {
        return "{[" + value + "]}";
    }

    public T getValue() {
        return value;
    }

}

interface I1 {

}

interface I2 {

}

class Info3<T extends Number&I1&I2> {

    private final T value;

    public Info3(T value) {
        this.value = value;
    }

    public String toString() {
        return "{[" + value + "]}";
    }

    public T getValue() {
        return value;
    }

}

class MyNumber<T> extends Number implements I1, I2 {

    T value;
    Number n;

    public MyNumber(T value, Number n) {
        this.n = n;
        this.value = value;
    }

    @Override
    public int intValue() {
        return (int)n;
    }

    @Override
    public long longValue() {
        return (long)n;
    }

    @Override
    public float floatValue() {
        return (float)n;
    }

    @Override
    public double doubleValue() {
        return (double)n;
    }

    @Override
    public String toString() {
        return "MyNumber{" +
                "value=" + value +
                ", n=" + n +
                '}';
    }
}