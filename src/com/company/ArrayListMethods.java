package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListMethods {
    public static Scanner input = new Scanner(System.in);

    public static ArrayList<Integer> numberList()
    {
        ArrayList<Integer> list = new ArrayList<Integer> ();
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
        System.out.println(" Enter decimal values");
        double num =0;
        ArrayList<Double> list = new ArrayList<Double>();
        while (num != 0)
        { num = input.nextDouble();
            list.add(num);
    }

    }

}
