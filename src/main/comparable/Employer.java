package main.comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author s.melekhin
 * @since 21 нояб. 2021 г.
 */
public class Employer implements Comparable<Employer> {

    public static void main(String[] args) {
        List<Employer> list = new ArrayList<>();
        Employer emp1 = new Employer(1, "Zaur", "Tregubov", 10000);
        Employer emp2 = new Employer(2, "Ivan", "Ivanov", 15000);
        Employer emp3 = new Employer(3, "Marina", "Guseva", 20000);
        list.add(emp3);
        list.add(emp2);
        list.add(emp1);
        System.out.println("Before sort \n" + list);
        Collections.sort(list);
        System.out.println("After sort \n" + list);
    }

    int id;
    String name;
    String surname;
    int salary;

    public Employer(int id, String name, String surname, int salary) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", salary=" + salary +
                '}';
    }

    @Override
    public int compareTo(Employer o) {
//        if (this.id == o.id) {
//            return 0;
//        } else if (this.id > o.id) {
//            return 1;
//        } else {
//            return -1;
//        }
//        or
//        return this.id - o.id;
//        or
//        return this.name.compareTo(o.name);
        return Integer.compare(this.id, o.id);
    }
}
