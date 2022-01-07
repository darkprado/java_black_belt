package main.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author s.melekhin
 * @since 07 янв. 2022 г.
 */
public class MyArrayListExample2 {

    public static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder("A");
        StringBuilder sb2 = new StringBuilder("B");
        StringBuilder sb3 = new StringBuilder("C");
        StringBuilder sb4 = new StringBuilder("D");
        StringBuilder[] array = {sb1, sb2, sb3, sb4};
        List<StringBuilder> list = Arrays.asList(array);
        System.out.println(list);
        array[0].append("!!!");
        System.out.println(list);

//        removeAll
        ArrayList<String> arrayListString1 = new ArrayList<>();
        arrayListString1.add("Ivan");
        arrayListString1.add("Stanislav");
        arrayListString1.add("Elena");
        System.out.println(arrayListString1);

        ArrayList<String> arrayListString2 = new ArrayList<>();
        arrayListString2.add("Ivan");
        arrayListString2.add("Oleg");
        arrayListString2.add("Inna");

        arrayListString1.removeAll(arrayListString2);
        System.out.println(arrayListString1);

//        retainAll
        ArrayList<String> arrayListString3 = new ArrayList<>();
        arrayListString3.add("Stanislav");
        arrayListString1.retainAll(arrayListString3);
        System.out.println(arrayListString1);

//        containsAll
        arrayListString1.add("Elena");
        System.out.println(arrayListString1.containsAll(arrayListString2));
        ArrayList<String> arrayListString4 = new ArrayList<>();
        arrayListString4.add("Stanislav");
        arrayListString4.add("Elena");
        System.out.println(arrayListString1.containsAll(arrayListString4));

//        subList
        arrayListString1.add("Ivan");
        arrayListString1.add("Oleg");
        arrayListString1.add("Inna");
        System.out.println(arrayListString1);
        List<String> myList = arrayListString1.subList(0, 2);
        System.out.println(myList);
        myList.add("Fedor");
        System.out.println(myList);
        System.out.println(arrayListString1);

//        toArray
        Object[] arrayObj = arrayListString1.toArray();
        String[] strings = arrayListString1.toArray(new String[0]);
        for (String s : strings) {
            System.out.println(s);
        }

    }

}
