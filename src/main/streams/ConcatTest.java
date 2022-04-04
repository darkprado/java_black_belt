package main.streams;

import java.util.stream.Stream;

/**
 * @author s.melekhin
 * @since 04 апр. 2022 г.
 */
public class ConcatTest {

    public static void main(String[] args) {
        Stream<Integer> stream1 = Stream.of(1, 2, 3, 4, 5);
        Stream<Integer> stream2 = Stream.of(6, 7, 8, 9, 10);
        Stream<Integer> stream3 = Stream.concat(stream1, stream2);
        stream3.forEach(System.out::println);
    }

}
