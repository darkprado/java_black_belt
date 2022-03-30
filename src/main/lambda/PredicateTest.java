package main.lambda;

import java.util.ArrayList;
import java.util.function.Predicate;

/**
 * @author s.melekhin
 * @since 30 март 2022 г.
 */
public class PredicateTest {

    static void testStudents(ArrayList<Student> arrayList, Predicate<Student> pr) {
        for (Student s : arrayList) {
            if (pr.test(s)) {
                System.out.println(s);
            }
        }
    }

    public static void main(String[] args) {
        Student student1 = new Student("Ivan", 'm', 22, 3, 8.3);
        Student student2 = new Student("Nikolay", 'm', 23, 2, 6.4);
        Student student3 = new Student("Elena", 'w', 24, 1, 4.3);
        Student student4 = new Student("Oleg", 'm', 25, 4, 5.7);
        Student student5 = new Student("Olga", 'w', 26, 5, 8.9);

        ArrayList<Student> students = new ArrayList<>();

        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        students.add(student5);

        Predicate<Student> predicate = student -> student.avgGrade < 5;

        students.removeIf(student -> student.sex == 'm');
        System.out.println(students);

        students.removeIf(predicate);
        System.out.println(students);

        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        students.add(student5);
        System.out.println(students);

        Predicate<Student> predicateAvg = student -> student.avgGrade > 7;
        Predicate<Student> predicateSex = student -> student.sex == 'm';

        testStudents(students, predicateSex.and(predicateAvg));

        students.removeIf(predicateSex.or(predicateAvg));
        System.out.println(students);

        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        students.add(student5);
        students.removeIf(predicateSex.or(predicateAvg).negate());
        System.out.println(students);

    }

}
