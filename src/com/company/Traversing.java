package com.company;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Traversing
{
    public static Scanner input = new Scanner(System.in);

    public static ArrayList<String> getStates() {

        ArrayList<String> list = new ArrayList<String>();
        for (int i = 1; i < list.size(); i++) {
            System.out.println("Next state or \"Stop\":");
            String word = input.next();
            list.add(word);
            if (word.equals("Stop")) {
                while (list.get(i).equals("Stop")) {
                    System.out.println("Next state or \"Stop\":");
                    word = input.next();
                    list.add(word);
                }
            }
            System.out.print(createList(list));
        }
        return list;
    }
        public static String createList(ArrayList<String> states)
        { String state = "";
            for(int count=0;count< states.size(); count++) {

                state += states.get(count);
                if (count == states.size()-1)
                    {
                        break;
                    }
                else
                       state += " -> ";
            }
            return state;

            }


    public static ArrayList<Integer> largestAndSmallest() throws IOException
    {
        ArrayList<Integer> numbers = new ArrayList<>();

    }
}


