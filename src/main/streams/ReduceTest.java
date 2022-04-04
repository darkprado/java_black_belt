package main.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 * @author s.melekhin
 * @since 04 апр. 2022 г.
 */
public class ReduceTest {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(8);
        list.add(2);
        list.add(4);
        list.add(3);

        int result = list.stream().reduce((accumulator, element) -> accumulator * element).get();

        System.out.println(result);

        List<Integer> list2 = new ArrayList<>();
        Optional<Integer> result2 = list2.stream().reduce((accumulator, element) -> accumulator * element);

        if (result2.isPresent()) {
            System.out.println(result2.get());
        } else {
            System.out.println("Not present");
        }

        int result3 = list.stream().reduce(1, (accumulator, element) -> accumulator * element);

        System.out.println(result3);

        List<String> stringList = new ArrayList<>();
        stringList.add("privet");
        stringList.add("ok");
        stringList.add("poka");
        stringList.add("kak dela?");

        String result4 = stringList.stream().reduce((acc, el) -> acc + ", " + el).get();

        System.out.println(result4);

    }

}
