package main.streams;

import java.util.*;
import java.util.stream.Collectors;

/**
 * @author s.melekhin
 * @since 04 апр. 2022 г.
 */
public class MapTest {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("privet");
        list.add("ok");
        list.add("poka");
        list.add("kak dela?");

        System.out.println(list);

        List<Integer> list2 = list.stream().map(elem -> elem.length()).collect(Collectors.toList());

        System.out.println(list2);

        int[] arr = {5, 3, 9, 8, 1};

        int[] ints = Arrays.stream(arr).map(i -> {
            if (i % 3 == 0) {
                i = i / 3;
            }
            return i;
        }).toArray();

        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(ints));

        Set<String> set = new TreeSet<>();
        set.add("privet");
        set.add("ok");
        set.add("poka");
        set.add("kak dela?");

        System.out.println(set);

        Set<Integer> collectSet = set.stream().map(String::length).collect(Collectors.toSet());

        System.out.println(collectSet);

        List<Integer> collectList = set.stream().map(String::length).collect(Collectors.toList());

        System.out.println(collectList);
    }

}
