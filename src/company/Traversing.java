package company;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Traversing {

    public static ArrayList<String> getStates() {

        Scanner input = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<String>();
        for (int i = 0 ; i < list.size() ; i++) {
            System.out.println("Next state or \"Stop\":");
            String word = input.next();
            list.add(word);
            if (word.equals("Stop")) {
                list.remove(i);
                break;

                }
            }

                return list;
    }

    public static String createList(ArrayList<String> states) {
        String state = "";
        for (int count = 0; count < states.size(); count++) {

            state += states.get(count);
            if (count == states.size() - 1) {
                break;
            } else
                state += " -> ";
        }
        return state;

    }


    public static ArrayList<Integer> largestAndSmallest() throws IOException {
        Scanner input = new Scanner(new File("file.txt"));
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


