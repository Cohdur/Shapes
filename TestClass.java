import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class TestClass
{
    @Test
    public void testRightTriangle()
    {
        RightTriangle rt = new RightTriangle(3.0, 4.0);
        assertEquals(6.0, rt.getArea(), 0.0001);
        assertEquals(12.0, rt.getPerimeter(), 0.0001);
        assertEquals(3, rt.NumberOfSides());
    }

    @Test
    public void testIsocelesRightTriangle()
    {
        IsocelesRightTriangle irt = new IsocelesRightTriangle(3.0, 4.0);
        assertEquals(6.0, irt.getArea(), 0.0001);
        assertEquals(10.2426, irt.getPerimeter(), 0.0001);
        assertEquals(3, irt.NumberOfSides());
    }

    @Test
    public void testCircle()
    {
        Circle c = new Circle(3.0);
        assertEquals(28.2743, c.getArea(), 0.0001);
        assertEquals(18.8495, c.getPerimeter(), 0.0001);
    }

    @Test
    public void testRectangle()
    {
        Rectangle r = new Rectangle(3.0, 4.0);
        assertEquals(12.0, r.getArea(), 0.0001);
        assertEquals(14.0, r.getPerimeter(), 0.0001);
        assertEquals(4, r.NumberOfSides());
    }

}
