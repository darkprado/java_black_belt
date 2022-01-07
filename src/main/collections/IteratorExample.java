package main.collections;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @author s.melekhin
 * @since 07 янв. 2022 г.
 */
public class IteratorExample {

    public static void main(String[] args) {
        ArrayList<String> arrayListString1 = new ArrayList<>();
        arrayListString1.add("Ivan");
        arrayListString1.add("Stanislav");
        arrayListString1.add("Elena");
        arrayListString1.add("Oleg");
        arrayListString1.add("Inna");

        Iterator<String> iterator = arrayListString1.iterator();
        while(iterator.hasNext()) {
            System.out.println(iterator.next());
            iterator.remove();
        }
        System.out.println(arrayListString1);
    }

}
