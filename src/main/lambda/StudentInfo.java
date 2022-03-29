package main.lambda;

import java.util.ArrayList;
import java.util.Collections;

/**
 * @author s.melekhin
 * @since 29 март 2022 г.
 */
public class StudentInfo {

    void testStudents(ArrayList<Student> arrayList, StudentChecks studentChecks) {
        for (Student s : arrayList) {
            if (studentChecks.check(s)) {
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

        StudentInfo studentInfo = new StudentInfo();
        studentInfo.printStudentsOverGrade(students, 8);
        System.out.println("---------------------------------");

        studentInfo.printStudentsUnderAge(students, 24);
        System.out.println("---------------------------------");

        studentInfo.printStudentsMixConditions(students, 23, 8, 'w');
        System.out.println("---------------------------------");

        studentInfo.testStudents(students, new CheckOverGrade());
        System.out.println("---------------------------------");

        studentInfo.testStudents(students, new StudentChecks() {
            @Override
            public boolean check(Student s) {
                return s.age < 30;
            }
        });
        System.out.println("---------------------------------");

        studentInfo.testStudents(students, (Student s) -> {
            return s.sex == 'w';
        });
        System.out.println("---------------------------------");

        StudentChecks sc = s -> s.sex == 'w';
        studentInfo.testStudents(students, sc);
        System.out.println("---------------------------------");

        Collections.sort(students, (st1, st2) -> st1.course - st2.course);
        System.out.println(students);

    }

    void printStudentsOverGrade(ArrayList<Student> arrayList, double grade) {
        for (Student s : arrayList) {
            if (s.avgGrade > grade) {
                System.out.println(s);
            }
        }
    }

    void printStudentsUnderAge(ArrayList<Student> arrayList, int age) {
        for (Student s : arrayList) {
            if (s.age > age) {
                System.out.println(s);
            }
        }
    }

    void printStudentsMixConditions(ArrayList<Student> arrayList, int age, double grade, char sex) {
        for (Student s : arrayList) {
            if (s.age > age && s.avgGrade > grade && s.sex == sex) {
                System.out.println(s);
            }
        }
    }


}

interface StudentChecks {
    boolean check(Student s);
}

class CheckOverGrade implements StudentChecks {

    @Override
    public boolean check(Student s) {
        return s.avgGrade > 8;
    }
}