package company;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class ListOfRectangles {


    public static ArrayList<Rectangle> getRectangles() throws IOException {
  Scanner input = new Scanner(new File("rectangle.txt"));
    ArrayList<Rectangle> rect = new ArrayList<>();
        while(input.hasNext())
        {
       rect.add(new Rectangle(input.nextDouble(),input.nextDouble()));

    }
        return rect;
    }
    public static double findAverage(ArrayList<Rectangle> rectangles) //method is double
    {
return 0.0;
    }
    public static void main(String[] args)
    {

    }
}
