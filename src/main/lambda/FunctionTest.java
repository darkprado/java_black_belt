package main.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

/**
 * @author s.melekhin
 * @since 30 март 2022 г.
 */
public class FunctionTest {

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

        Function<Student, Double> f = student -> 3.14;
        double resultAvg = avgOfSmth(students, student -> student.avgGrade);
        System.out.println(resultAvg);
        System.out.println(avgOfSmth(students, student -> (double)student.course));
        System.out.println(avgOfSmth(students, student -> (double)student.age));

    }

    private static double avgOfSmth(List<Student> list, Function<Student, Double> f) {
        double result = 0;
        for (Student s : list) {
            result += f.apply(s);
        }
        return result / list.size();
    }

}
