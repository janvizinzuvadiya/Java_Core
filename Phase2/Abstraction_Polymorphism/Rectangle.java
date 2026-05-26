public class Rectangle extends Shape implements Resizeable
{
    int length , width;

    public Rectangle(int length, int width,String shapeName) {
        super(shapeName);
        this.length = length;
        this.width = width;
    }

    @Override
    public double calculateArea() {
        double result = length * width;
        return Math.round(result);
    }

    @Override
    public void resize(double percentage)
    {
       length = (int) (length*(1+percentage/100));
       width = (int) (width*(1+percentage/100));
    }

    
    
}
