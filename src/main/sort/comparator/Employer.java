package main.sort.comparator;

import java.util.ArrayList;
import java.util.List;

/**
 * @author s.melekhin
 * @since 21 нояб. 2021 г.
 */
public class Employer {

    public static void main(String[] args) {
        List<Employer> list = new ArrayList<>();
        Employer emp1 = new Employer(1, "Zaur", "Tregubov", 10000);
        Employer emp2 = new Employer(2, "Ivan", "Ivanov", 15000);
        Employer emp3 = new Employer(3, "Marina", "Guseva", 20000);
        list.add(emp3);
        list.add(emp2);
        list.add(emp1);
        System.out.println("Before sort \n" + list);
        list.sort(new IdComparator());
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

}
