package main.streams;

import java.util.ArrayList;
import java.util.List;

/**
 * @author s.melekhin
 * @since 04 апр. 2022 г.
 */
public class ParallelTest {

    public static void main(String[] args) {

        List<Double> list = new ArrayList<>();
        list.add(10.0);
        list.add(5.0);
        list.add(1.0);
        list.add(0.25);

        double sumRes = list.parallelStream().reduce((a, e) -> a + e).get();
        System.out.println(sumRes);

        double divRes = list.stream().reduce((a, e) -> a / e).get();
        System.out.println(divRes);

        double divResParallel = list.parallelStream().reduce((a, e) -> a / e).get();
        System.out.println(divResParallel);

    }

}
