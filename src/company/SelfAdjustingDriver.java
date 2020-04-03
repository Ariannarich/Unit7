package company;

import java.util.ArrayList;

public class SelfAdjustingDriver {
    public static void main(String[] args) {
        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(12);
        list2.add(14);
        list2.add(8);
        list2.add(2);
        list2.add(0);


        SelfAdjusting a = new SelfAdjusting(list2);
        System.out.println(a.adjustList());
           System.out.print(a.getList());

        }

}

