package company;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Algorithms {

    public static ArrayList<Integer> fileDuplicates() throws IOException {
        Scanner input = new Scanner(new File("file1.txt"));
        ArrayList<Integer> numbers1 = new ArrayList<>();

        while (input.hasNext()) {
            numbers1.add(input.nextInt());
        }
        ArrayList<Integer> numbers2 = new ArrayList<>();
        Scanner input2 = new Scanner(new File("file2.txt"));
        while (input2.hasNext()) {
            numbers2.add(input2.nextInt());
        }
        ArrayList<Integer> numbers3 = new ArrayList<>();
    for (int x =0 ; x<numbers1.size();x++) {
        for (int i : numbers2)
            if (i == (numbers1.get(x))) {
                numbers3.add(i);
            }
    }



        return numbers3;
            }




    public static ArrayList<String> fileDuplicatesTwo() throws IOException {

        Scanner input = new Scanner(new File("names.txt"));
        ArrayList<String> numbers = new ArrayList<>();

        while (input.hasNext()) {
            numbers.add(input.next());
        }


        for( int i=0;i <numbers.size(); i++) {
            for(int x = 1; x < numbers.size(); x++) {
                if(i >= numbers.size() || x + 1 >= numbers.size() )
            {
               break;

            }
                if (numbers.get(i).equals(numbers.get(x+1)) && x+1 != i)
                {
                    numbers.remove(x+1);
                }

            }
        }

        return numbers;
    }
    public static ArrayList<Integer> orderedList()throws IOException
    {

        Scanner input = new Scanner(new File("file1.txt"));
        ArrayList<Integer> numbers = new ArrayList<>();

        while(input.hasNext())
        {
            numbers.add(input.nextInt());
        }
        for(int i = 0; i < numbers.size(); i++) {
            for (int x = 0; x < numbers.size(); x++) {
               if( x + 1 >= numbers.size() ){
                   break;
               }
                else if (numbers.get(x) > numbers.get(x + 1)) {
                    numbers.add(x+2,numbers.get(x));
                    numbers.remove(x);
                }
            }
        }
        return numbers;
    }

    }



