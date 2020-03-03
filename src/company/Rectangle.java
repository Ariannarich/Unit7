package company;

import java.awt.*;

public class Rectangle {
    private double length;
private double width;

public Rectangle( double l, double w)
{
    this.length =l;
    this.width =w;
}
public double getWidth()
{
    return width;
}
public double getLength()
    {
        return length;
    }
    public double area()
    {
        double area = length * width;
        return area;
    }
}
