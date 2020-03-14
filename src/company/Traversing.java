package company;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Traversing {

    public static ArrayList<String> getStates()
    {

        Scanner input = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<String>();
        System.out.println("Next state or \"Stop\":");
        String word = input.next();
        list.add(word);
        if (word.equals("Stop"))
        list.remove(word);
     while( !word.equals("Stop"))
      {
            System.out.println("Next state or \"Stop\":");
           word = input.next();
            list.add(word);
            if (word.equals("Stop")) {
                list.remove(word);
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
        Scanner input = new Scanner(new File("numbers.txt"));
        ArrayList<Integer> numbers = new ArrayList<>();

       while(input.hasNext())
       {
           numbers.add(input.nextInt());
       }
       int max =0;
       int min = 0;
       int count =0;
       for(int i: numbers) {
           if (count == 8)
               break;
           if (i > numbers.get(numbers.indexOf(i) +1) && max < i){
               max = i;

           }
           else if( max < i) {
               max = numbers.get(numbers.indexOf(i) +1);
               min = i;
           }
           if(min > i) {
               min = i;
           }
          count++;
       }
       numbers.remove(numbers.indexOf(max));
       numbers.remove(numbers.indexOf(min));
           numbers.add(0, min);
        numbers.add(numbers.size(),max);
        return numbers;
    }
}


