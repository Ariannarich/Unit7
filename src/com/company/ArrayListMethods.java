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
        list.remove(3);
        System.out.println(list);
        return list;
    }

    public static ArrayList<Double> firstAndLast() {
        System.out.println("Enter decimal values");

        ArrayList<Double> list = new ArrayList<Double>();
        double count = 0;
        double num = input.nextDouble();
        double first = num;
        count++;
        double last = 0;
        while (num != 0) {
            num = input.nextDouble();
            last = num;
            list.add(num);
            count++;
        }
        list.add(count);
        list.add(first);
        list.add(last);
        return list;
    }


    public static ArrayList<Double> getNumbers()
    {
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

    public static ArrayList<Double> arrangeList(ArrayList<Double> numbers){
        int count=0;
        while(count < numbers.size()) {
            if (count < numbers)
                numbers.add(y);
        }
    }

