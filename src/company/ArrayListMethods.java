package company;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListMethods {
    public static Scanner input = new Scanner(System.in);

    public static ArrayList<Integer> numberList() {
      ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(0);
        list.add(-5);
        list.add(7);
        list.add(12);
        list.add(-1);
        System.out.println(list);
        list.add(2, 10);
        list.set(1, 9);
        System.out.println(list);
        list.remove(4);
        return list;
    }

    public static ArrayList<Double> firstAndLast() {

        System.out.println("Enter decimal values:");

        int count = 0;
        double num = input.nextDouble();
        double first = num;

        double last = 0;
        while (num != 0) {

            num = input.nextDouble();
            count++;
            if (num == 0)
                break;

            last = num;

        }
        ArrayList<Double> list = new ArrayList<Double>();

        double count2 = count;
        list.add(0, count2);

        list.add(1, first);
        list.add(2, last);
        return list;
    }


    public static ArrayList<Double> getNumbers() {
        ArrayList<Double> list = new ArrayList<Double>();
        System.out.println("Enter decimal value 1");
        double val1 = input.nextDouble();
        list.add(val1);
        System.out.println("Enter decimal value 2");
        double val2 = input.nextDouble();
        list.add(val2);
        System.out.println("Enter decimal value 3");
        double val3 = input.nextDouble();
        list.add(val3);
        return list;
    }

    public static ArrayList<Double> arrangeList(ArrayList<Double> numbers) {
        ArrayList<Double> numbers2 = new ArrayList<Double>();
        if(numbers.get(0) > numbers.get(1) && numbers.get(0) > numbers.get(2))
        {
            numbers2.add(numbers.get(0));
            numbers.remove(0);
        }
       else if(numbers.get(1) > numbers.get(2) && numbers.get(1) > numbers.get(0)) {
            numbers2.add(numbers.get(1));
            numbers.remove(1);
        }
    else {
            numbers2.add(numbers.get(2));
            numbers.remove(2);
        }
    if(numbers.get(0) > numbers.get(1) )
    {
        numbers2.add(0,numbers.get(0));
        numbers2.add(0, numbers.get(1));
    }
    else {
        numbers2.add(0, numbers.get(1));
        numbers2.add(0, numbers.get(0));
    }

        return numbers2;
    }
}


