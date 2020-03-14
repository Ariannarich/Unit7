package company;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Algorithms {

    public static ArrayList<Integer> fileDuplicates() throws IOException {
        Scanner input = new Scanner(new File("file1.txt"));
        ArrayList<Integer> list1 = new ArrayList<>();

        while (input.hasNext()) {
            list1.add(input.nextInt());
        }
        ArrayList<Integer> list2 = new ArrayList<>();
        Scanner input2 = new Scanner(new File("file2.txt"));
        while (input2.hasNext()) {
            list2.add(input2.nextInt());
        }
        ArrayList<Integer> list3 = new ArrayList<>();
        int count = 0;
        for (int i = list2.size() - 1; i > 0; i--) {
            if (list1.get(count).equals(list2.get(i))) {
                list3.add(list2.get(i));
            }
            count++;
        }


        return list3;
            }




    public static ArrayList<String> fileDuplicatesTwo() throws IOException {

        Scanner input = new Scanner(new File("names.txt"));
        ArrayList<String> list = new ArrayList<>();

        while (input.hasNext()) {
            list.add(input.next());
        }
        for(int y = 0; y< list.size() -1; y++)
        {
        for (int x = list.size() -1; x >= 0; x--) {
            if (list.get(x).equals(list.get(y))) {
                list.remove(x);
            }
        }
        }
        return list;

    }

    public static ArrayList<Integer> orderedList()throws IOException
    {

        Scanner input = new Scanner(new File("file1.txt"));
        ArrayList<Integer> numbers = new ArrayList<>();

        while(input.hasNext())
        {
            numbers.add(input.nextInt());
        }
        for(int i = numbers.size() -2; i >=0; i--)
        {
            if (numbers. get(i) > numbers.get(i+1))
            {
                int temp = numbers.get(i);
                numbers.remove(numbers.get(i));
                numbers.add(temp);
            }
        }
        return numbers;
    }

    }



