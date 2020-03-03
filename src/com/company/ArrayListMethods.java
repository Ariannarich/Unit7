package com.company;

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
        list = arrangeList(list);
        return list;
    }

    public static ArrayList<Double> arrangeList(ArrayList<Double> numbers) {
        for (int i = numbers.size() - 1; i >= 0; i--) {
            for (int x = 0; x < numbers.size() - 1; x++)
            {
                if (numbers.get(x) > numbers.get(i)) {
                    numbers.add(x,numbers.get(i));
                    numbers.remove(numbers.get(i+1));
                    numbers.add(i +1 ,numbers.get(x));
                } else if (x > numbers.get(i) && x > numbers.get(i + 1)) {
                    numbers.set(i + 1, numbers.get(x));
                }
            }
        }
        return numbers;
    }
}


