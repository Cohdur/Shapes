public class IsocelesRightTriangle extends RightTriangle
{
    private double base;
    private double height;

    public IsocelesRightTriangle()
    {
        base = 1.0;
        height = 1.0;
    }

    public IsocelesRightTriangle(double b, double h)
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
        return (2 * base)  + (Math.sqrt(2) * base);
    }

    public int NumberOfSides()
    {
        return 3;
    }
    
}
