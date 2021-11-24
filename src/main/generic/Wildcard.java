package main.generic;

import java.util.ArrayList;
import java.util.List;

/**
 * @author s.melekhin
 * @since 24 нояб. 2021 г.
 */
public class Wildcard {

    public static void main(String[] args) {
        List<Double> listDouble = new ArrayList<>();
        listDouble.add(3.14);
        listDouble.add(3.15);
        listDouble.add(3.16);
        showListInfo(listDouble);

        List<String> listString = new ArrayList<>();
        listString.add("a");
        listString.add("b");
        listString.add("c");
        showListInfo(listString);

        System.out.println(sum(listDouble));
    }

    static void showListInfo(List<?> list) {
        System.out.println(list);
    }

    static double sum(List<? extends Number> list) {
        double sum = 0;
        for (Number n : list) {
            sum += n.doubleValue();
        }
        return sum;
    }

}
