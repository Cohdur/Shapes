
public class Rectangle extends Shape implements Polygon
{
    private double length;
    private double width;

    public Rectangle()
    {
        length = 1.0;
        width = 1.0;
    }

    public Rectangle(double l, double w)
    {
        length = l;
        width = w;
    }

    public double getLength()
    {
        return length;
    }

    public void setLength(float l)
    {
        length = l;
    }

    public double getWidth()
    {
        return width;
    }

    public void setWidth(float w)
    {
        width = w;
    }

    public double getArea()
    {
        return length * width;
    }

    public double getPerimeter()
    {
        return 2 * (length + width);
    }

    public int NumberOfSides()
    {
        return 4;
    }
}
