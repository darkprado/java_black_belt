package main.streams;

import java.util.ArrayList;
import java.util.List;

/**
 * @author s.melekhin
 * @since 04 апр. 2022 г.
 */
public class FlatMapTest {

    public static void main(String[] args) {

        Student student1 = new Student("Ivan", 'm', 22, 3, 8.3);
        Student student2 = new Student("Nikolay", 'm', 23, 2, 6.4);
        Student student3 = new Student("Elena", 'w', 24, 1, 4.3);
        Student student4 = new Student("Oleg", 'm', 25, 4, 5.7);
        Student student5 = new Student("Olga", 'w', 26, 5, 8.9);

        Faculty f1 = new Faculty("Economics");
        Faculty f2 = new Faculty("Math");

        f1.addStudentOnFaculty(student1);
        f1.addStudentOnFaculty(student2);
        f1.addStudentOnFaculty(student3);

        f2.addStudentOnFaculty(student4);
        f2.addStudentOnFaculty(student5);

        List<Faculty> facultyList = new ArrayList<>();
        facultyList.add(f1);
        facultyList.add(f2);

        facultyList.stream().flatMap(faculty -> faculty.getStudentsOnFaculty().stream())
                .forEach(el -> System.out.println(el.name));

    }

}

class Faculty {
    String name;
    List<Student> studentsOnFaculty;

    public Faculty(String name) {
        this.name = name;
        studentsOnFaculty = new ArrayList<>();
    }

    public List<Student> getStudentsOnFaculty() {
        return studentsOnFaculty;
    }

    public void addStudentOnFaculty(Student student) {
        studentsOnFaculty.add(student);
    }
}