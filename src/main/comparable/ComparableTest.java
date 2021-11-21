package main.comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author s.melekhin
 * @since 21 нояб. 2021 г.
 */
public class ComparableTest {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("Zaur");
        list.add("Ivan");
        list.add("Maria");
        System.out.println("Before sort");
        System.out.println(list);
        Collections.sort(list);
        System.out.println("After sort");
        System.out.println(list);

    }

}
