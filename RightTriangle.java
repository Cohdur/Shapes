public class RightTriangle extends Shape implements Polygon
{
    private double base;
    private double height;

    public RightTriangle()
    {
        base = 1.0;
        height = 1.0;
    }

    public RightTriangle(double b, double h)
    {
        base = b;
        height = h;
    }

    public double getArea()
    {
        return 0.5 * base * height;
    }

    public double getPerimeter()
    {
        return base + height + Math.sqrt(base * base + height * height);
    }
    
    public int NumberOfSides()
    {
        return 3;
    }
}
