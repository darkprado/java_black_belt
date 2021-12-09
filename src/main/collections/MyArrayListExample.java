package main.collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * @author s.melekhin
 * @since 03 дек. 2021 г.
 */
public class MyArrayListExample {

    public static void main(String[] args) {

        ArrayList<String> arrayListString = new ArrayList<>();
        arrayListString.add("Ivan");
        arrayListString.add("Stanislav");
        arrayListString.add("Elena");
        arrayListString.add(1, "Misha");
        System.out.println(arrayListString);

        arrayListString.set(0, "Anton");

        System.out.println(arrayListString);

        arrayListString.remove(0);

        System.out.println(arrayListString);

        ArrayList<String> arrayListWithInitCapacity = new ArrayList<>(200);

        List<String> arrayListInterface = new ArrayList<>();

        List<String> arrayListWithList = new ArrayList<>(arrayListString);
        System.out.println(arrayListString == arrayListWithList);

        //Student
        Student st1 = new Student("Stanislav", 'm', 33, 1, 10);
        Student st2 = new Student("Elena", 'w', 23, 1, 9);
        Student st3 = new Student("Oleg", 'm', 35, 1, 8);
        Student st4 = new Student("Dmitriy", 'm', 43, 1, 7.2);
        Student st5 = new Student("Ivan", 'm', 27, 1, 2);

        ArrayList<Student> studentList = new ArrayList<>();
        studentList.add(st1);
        studentList.add(st2);
        studentList.add(st3);
        studentList.add(st4);
        studentList.add(st5);
        System.out.println(studentList);

        Student st6 = new Student("Ivan", 'm', 27, 1, 2);

        studentList.remove(st6);

        System.out.println(studentList);

        studentList.add(st5);

        ArrayList<String> arrayList2 = new ArrayList<>();
        arrayList2.add("!!!");
        arrayList2.add("???");
        arrayList2.addAll(arrayListString);
        arrayList2.addAll(0, arrayListString);

        System.out.println(arrayList2);

        arrayList2.clear();

        System.out.println(arrayList2.isEmpty());

        System.out.println(studentList.indexOf(st6)); //lastIndexOf()

        System.out.println(studentList.size());

        System.out.println(arrayListString.contains("Stanislav"));

    }

}

class Student {

    private String name;
    private char sex;
    private int age;
    private int course;
    private double avgGrade;

    public Student(String name, char sex, int age, int course, double avgGrade) {
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.course = course;
        this.avgGrade = avgGrade;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", sex=" + sex +
                ", age=" + age +
                ", course=" + course +
                ", avgGrade=" + avgGrade +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Student student = (Student) o;
        return sex == student.sex && age == student.age && course == student.course && Double.compare(student.avgGrade, avgGrade) == 0
                && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, sex, age, course, avgGrade);
    }
}
