public class Triangle extends Shape {

    double height;
    double base;

    public Triangle(double height,double length, double base, String name) throws InvalidShapeException
    {
        super(name);

        if(height <= 0 || base <= 0 || length <= 0)
        {
            throw new InvalidShapeException("Dimentions cannot be negative");
        }
        if(height +base <= length || height+length <= base || base+length <= height)
        {
            throw new InvalidShapeException("Triangle inequality theorem not satisfied");
        }

        this.height = height;
        this.base = base;
    }

    @Override
    public double calculateArea() {
        return 0.5*base*height;
    }
}
