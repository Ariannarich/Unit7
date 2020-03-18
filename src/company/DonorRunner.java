package company;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class DonorRunner {

    public static ArrayList<Donor> readFile() throws IOException {
        Scanner input = new Scanner(new File("donors.txt"));
       ArrayList<Donor> donor = new ArrayList<>();


       while(input.hasNextLine())
        {
            String l = input.nextLine();
            int index = l.indexOf(" ");
            String name = l.substring(0, index);
            double amount = Double.parseDouble(l.substring(index+1, l.length()-1));
            Donor di = new Donor(name, amount);
            donor.add(di);
        }
return donor;
    }
    public static void sortDonors(ArrayList<Donor> d) throws IOException {

        for (int i = 0; i < d.size() - 1; i++) {
            int index = i;
            for (int x = i + 1; x < d.size(); x++) {
                if (d.get(x).getAmount() > d.get(index).getAmount())
                    index = x;
            }
            Donor temp = d.get(i);
            d.set(index, d.get(i));
            d.set(i, temp);
        }

    }

}
