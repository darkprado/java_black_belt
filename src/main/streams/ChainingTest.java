package main.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * @author s.melekhin
 * @since 04 апр. 2022 г.
 */
public class ChainingTest {

    public static void main(String[] args) {

        int[] arr = {3, 4, 8, 1, 5, 17, 2, 81, 88, 102, 107};

        int asInt = Arrays.stream(arr).filter(e -> e % 2 == 1)
                .map(e -> {
                    if (e % 3 == 0) {
                        e = e / 3;
                    }
                    return e;
                })
                //(acc, el) -> acc + el
                .reduce(Integer::sum).getAsInt();

        System.out.println(asInt);

        Student student1 = new Student("Ivan", 'm', 22, 3, 8.3);
        Student student2 = new Student("Nikolay", 'm', 23, 2, 6.4);
        Student student3 = new Student("Elena", 'w', 24, 1, 4.3);
        Student student4 = new Student("Oleg", 'm', 25, 4, 5.7);
        Student student5 = new Student("Olga", 'w', 26, 5, 8.9);

        List<Student> students = new ArrayList<>();

        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        students.add(student5);

        students.stream()
                .map(el -> {
                    el.name = el.name.toUpperCase();
                    return el;
                })
                .filter(el -> el.sex == 'w')
                .sorted(Comparator.comparing(el -> el.age))
                .forEach(System.out::println);
    }
}
