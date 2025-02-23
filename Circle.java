public class Circle extends Shape 
{
    private double radius;

    public Circle()
    {
        radius = 1.0;
    }

    public Circle(double r)
    {
        radius = r;
    }

    public double getArea()
    {
        return radius * radius * Math.PI;
    }
    
    public double getPerimeter()
    {
        return 2 * radius * Math.PI;
    }

}
