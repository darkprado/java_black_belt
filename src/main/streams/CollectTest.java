package main.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @author s.melekhin
 * @since 04 апр. 2022 г.
 */
public class CollectTest {

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

        Map<Integer, List<Student>> map = students.stream()
                .peek(el -> el.name = el.name.toUpperCase())
                .collect(Collectors.groupingBy(el -> el.course));

        for (Map.Entry<Integer, List<Student>> entry : map.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue().toString());
        }

        Map<Boolean, List<Student>> map2 = students.stream().collect(Collectors.partitioningBy(el -> el.avgGrade > 6));
        for (Map.Entry<Boolean, List<Student>> entry : map2.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue().toString());
        }

    }

}
