public abstract class Shape
{
    String shapeName;
    
    public abstract double calculateArea();

    public Shape(String shapeName)
    {
        this.shapeName = shapeName;
    }

    public void displayDescription()
    {
        System.out.println("This is a shape: "+shapeName);
    }

}