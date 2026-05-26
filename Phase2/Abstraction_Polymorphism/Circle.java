public class Circle extends Shape
{
    int radius;

    public Circle(int radius,String shapeName) {
        super(shapeName);
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
       
        double result = Math.PI*radius*radius;
        return Math.round(result);
    }
    
    
    
}
