package company;

import java.util.ArrayList;
/**
 * @author Arianna Richardson
 * @since April 1st, 2020.
 * This program creates a self-adjusting list that adjusts itself based on the input given.
 */
/**
 * Start code:
 * Declares the list array.
 */
public class SelfAdjusting {
    private ArrayList<Integer> list;
    /**
     * Constructor for SelfAdjusting object.
     * @param arr ArrayList of integers used for input.
     * Assigns parameter to instance variable.
     */
    public SelfAdjusting(ArrayList<Integer> arr) {
        this.list = arr;

    }

    /**
     * Accessor method that returns the integer ArrayList.
     * @return list returns the ArrayList.
     */
    public ArrayList<Integer> getList() {
        return list;
    }

    /** Method that creates a new even number integer ArrayList that holds 9 values.
     * Then, checks if the new list and input list share the same value.
     * If so, the number is moved from its old position to the beginning of the initial list.
     * If not, the new value is added to the beginning of the initial list.
     * @return list2 returns the new initial list.
     */
    public ArrayList<Integer> adjustList() {

        ArrayList<Integer> list2 = new ArrayList<>(10);
        int count = 0;
        int i = 0;
        while (count < 10) {
            i += 2;
            list2.add(count, i);
            count++;
        }

        for (int j = 0; j < list.size(); j++) {
            boolean found = false;
            for (int k = 0; k < list2.size(); k++) {
                if (list.get(j).equals(list2.get(k))) {
                    list2.add(0, list2.remove(k));
                    found = true;
                    break;
                }
            }
            if (!found) {
                list2.add(0, list.get(j));
            }
        }
        return list2;

    }
}
    /**
     * End code:
     */

