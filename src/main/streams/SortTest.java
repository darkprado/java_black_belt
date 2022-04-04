package main.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author s.melekhin
 * @since 04 апр. 2022 г.
 */
public class SortTest {

    public static void main(String[] args) {
        int[] arr = {3, 4, 8, 1, 5, 17, 2};
        System.out.println(Arrays.toString(Arrays.stream(arr).sorted().toArray()));

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

        // (x, y) -> x.name.compareTo(y.name)
        List<Student> collectStuds = students.stream().sorted(Comparator.comparing(x -> x.name)).collect(Collectors.toList());

        System.out.println(students);

        System.out.println(collectStuds);
    }

}
