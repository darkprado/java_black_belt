package main.collections;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

/**
 * @author s.melekhin
 * @since 07 янв. 2022 г.
 */
public class ListIteratorExample {

    public static void main(String[] args) {
        String s = "madam";
        List<Character> characterList = new LinkedList<>();
        for (char ch : s.toCharArray()) {
            characterList.add(ch);
        }
        ListIterator<Character> iterator = characterList.listIterator();
        ListIterator<Character> iteratorRevers = characterList.listIterator(characterList.size());
        boolean isPalindrome = true;
        while(iterator.hasNext() && iteratorRevers.hasPrevious()) {
            if (iterator.next() != iteratorRevers.previous()) {
                isPalindrome = false;
                break;
            }
        }
        if (isPalindrome) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not palindrome");
        }
    }

}
