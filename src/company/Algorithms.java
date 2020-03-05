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
        while (list1.get(count) == list2.get(count)) {
            list3.add(list2.get(count));
            count++;
        }
        return list3;
    }
        public static ArrayList<String> fileDuplicatesTwo() throws IOException
        {

            Scanner input = new Scanner(new File("names.txt"));
            ArrayList<String> list1 = new ArrayList<>();

            while(input.hasNext())
            {
                list1.add(input.next());
            }
            int count = 0;

            }

        }

    }
}
