package main.lambda;

/**
 * @author s.melekhin
 * @since 29 март 2022 г.
 */
public class Test2 {
    static void def(I i) {
        System.out.println(i.abc("hello"));
    }

    public static void main(String[] args) {
        def(String::length);
    }
}

interface I {
    int abc(String s);
}