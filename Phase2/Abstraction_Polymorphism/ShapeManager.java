import java.util.ArrayList;
import java.util.List;

public class ShapeManager {

    ArrayList<Circle> clist = new ArrayList<>();
    ArrayList<Rectangle> rectList = new ArrayList<>();
    ArrayList<Triangle> tlist = new ArrayList<>();

    public void groupShapes(List<Shape> shapes)
    {
        for(Shape s : shapes)
        {
           if(s instanceof Circle c)
           {
               clist.add(c);
           }
           else if(s instanceof Rectangle r)
           {
               rectList.add(r);
           }
           else if(s instanceof Triangle t)
           {
               tlist.add(t);
           }
        }

    }
    public void calculatePerimeter()
    {
        
    }

    public void displayAllShapes()
    {
        clist.forEach(c -> System.out.println(c));
        rectList.forEach(r -> System.out.println(r));
        tlist.forEach(t -> System.out.println(t));
    }

}
