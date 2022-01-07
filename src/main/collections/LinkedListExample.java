package main.collections;

import java.util.LinkedList;

/**
 * @author s.melekhin
 * @since 07 янв. 2022 г.
 */
public class LinkedListExample {

    public static void main(String[] args) {

        Student2 st1 = new Student2("Stanislav", 12);
        Student2 st2 = new Student2("Elena", 1);
        Student2 st3 = new Student2("Oleg", 2);
        Student2 st4 = new Student2("Igor", 5);
        Student2 st5 = new Student2("Egor", 7);

        LinkedList<Student2> student2LinkedList = new LinkedList<>();
        student2LinkedList.add(st1);
        student2LinkedList.add(st2);
        student2LinkedList.add(st3);
        student2LinkedList.add(st4);
        student2LinkedList.add(st5);
        System.out.println(student2LinkedList);
        System.out.println(student2LinkedList.get(3));
        Student2 st6 = new Student2("Zaur", 7);
        student2LinkedList.add(st6);
        System.out.println(student2LinkedList);

    }

}

class Student2 {

    String name;
    int course;

    public Student2(String name, int course) {
        this.name = name;
        this.course = course;
    }

    @Override
    public String toString() {
        return "Student2{" +
                "name='" + name + '\'' +
                ", course=" + course +
                '}';
    }
}