package main.generic;

import java.util.ArrayList;
import java.util.List;

/**
 * @author s.melekhin
 * @since 22 нояб. 2021 г.
 */
public class ParameterizedMethod {

    public static void main(String[] args) {
        List<Integer> listInt = new ArrayList<>();
        listInt.add(12);
        System.out.println(getFirstElement(listInt));
        List<String> listString = new ArrayList<>();
        listString.add("Hello");
        System.out.println(getFirstElement(listString));
    }

    public static <T> T getFirstElement(List<T> list) {
        return list.get(0);
    }

}
