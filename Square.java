public class Square extends Rectangle
{
    private double side;
    
    public Square()
    {
        side = 1.0;
    }
    
    public Square(double s)
    {
        side = s;
    }
    
    public double getArea()
    {
        return side * side;
    }
    
    public double getPerimeter()
    {
        return 4 * side;
    }
    
    public int NumberOfSides()
    {
        return 4;
    }
}
