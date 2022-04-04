package main.streams;

import java.util.stream.Stream;

/**
 * @author s.melekhin
 * @since 04 апр. 2022 г.
 */
public class DistinctTest {

    public static void main(String[] args) {
        Stream<Integer> stream1 = Stream.of(1, 2, 3, 4, 5, 1, 3, 2);
        stream1.distinct().forEach(System.out::println);
    }

}
