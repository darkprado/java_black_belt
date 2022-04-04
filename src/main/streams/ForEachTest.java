package main.streams;

import java.util.Arrays;

/**
 * @author s.melekhin
 * @since 04 апр. 2022 г.
 */
public class ForEachTest {

    public static void main(String[] args) {
        int[] arr = {5, 9, 3, 8, 1};
        Arrays.stream(arr).forEach(el -> {
            el *= 3;
            System.out.println(el);
        });

        System.out.println("___________________________________");

        Arrays.stream(arr).forEach(Utils::myMethod);
    }

}

class Utils {
    public static void myMethod(int a) {
        a += a;
        System.out.println(a);
    }
}