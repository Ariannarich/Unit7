package company;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Sorting {
    public static ArrayList<Integer> getUnsorted() throws IOException {
        Scanner input = new Scanner(new File("sortedData1.txt"));
        ArrayList<Integer> numbers = new ArrayList<>();

        while (input.hasNext()) {
            numbers.add(input.nextInt());
        }
        for (int i = 0; i < numbers.size() - 1; i++) {
            int index = i;
            for (int x = i + 1; x < numbers.size(); x++)
                if (numbers.get(x) < numbers.get(index))
                    index = x;
            int smallerNumber = numbers.get(index);
            numbers.set(index, numbers.get(i));
            numbers.set(i, smallerNumber);
        }
        return numbers;
    }

    public static boolean isSorted(ArrayList<Integer> arr) {

        ArrayList<Integer> numbers = new ArrayList<>();

        int count = 0;
        while (arr.size() > numbers.size()) {
            numbers.add(count, arr.get(count));
            count++;
        }
        for (int i = 0; i < numbers.size(); i++) {
            for (int x = 0; x < numbers.size(); x++) {
                if (x + 1 >= numbers.size()) {
                    break;
                } else if (numbers.get(x) > numbers.get(x + 1)) {
                    numbers.add(x + 2, numbers.get(x));
                    numbers.remove(x);
                }
            }
        }

        if (numbers.equals(arr)) {
            return true;
        } else {
            return false;
        }
    }
}






