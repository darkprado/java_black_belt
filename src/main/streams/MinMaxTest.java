package main.streams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * @author s.melekhin
 * @since 04 апр. 2022 г.
 */
public class MinMaxTest {

    public static void main(String[] args) {

        Student student1 = new Student("Ivan", 'm', 22, 3, 8.3);
        Student student2 = new Student("Nikolay", 'm', 23, 2, 6.4);
        Student student3 = new Student("Elena", 'w', 24, 1, 4.3);
        Student student4 = new Student("Oleg", 'm', 25, 4, 5.7);
        Student student5 = new Student("Olga", 'w', 26, 5, 8.9);
        Student student6 = new Student("Leva", 'm', 26, 5, 3);

        List<Student> students = new ArrayList<>();

        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        students.add(student5);
        students.add(student6);

        Student minSt = students.stream().min(Comparator.comparing(s -> s.age)).get();
        System.out.println(minSt);

        Student maxSt = students.stream().max(Comparator.comparing(s -> s.age)).get();
        System.out.println(maxSt);
    }

}
