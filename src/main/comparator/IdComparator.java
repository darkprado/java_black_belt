package main.comparator;

import java.util.Comparator;

/**
 * @author s.melekhin
 * @since 21 нояб. 2021 г.
 */
public class IdComparator implements Comparator<Employer> {

    @Override
    public int compare(Employer emp1, Employer emp2) {
        if (emp1.id == emp2.id) {
            return 0;
        } else if (emp1.id > emp2.id) {
            return 1;
        } else {
            return -1;
        }
    }
}
