import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws InvalidShapeException {
        
        // Hard
        // Medium

        List<Shape> shapes = new ArrayList<Shape>();

        shapes.add(new Circle(10, "C1"));
        shapes.add(new Circle(3, "C2"));

        shapes.add(new Rectangle(10,11, "Rec1"));
        shapes.add(new Rectangle(3,7, "Rec2"));

        shapes.add(new Triangle(3.0, 4.0, 5.0, "T1"));
        shapes.add(new Triangle(3.0, 3.0, 3.0, "T2"));

        ShapeManager sm = new ShapeManager();
        sm.groupShapes(shapes);

            

        // double sum = 0;
        // for (Shape s:shapes)
        // {
        //     if (s instanceof Rectangle)
        //     {
        //         Rectangle r = (Rectangle) s;
        //         r.resize(100);
                
                // ((Rectangle) s).resize(100);
            // }

            // if(s instanceof Rectangle rect)
            // {
            //     rect.resize(100);
            // }
        //     sum+=s.calculateArea();
        // }

        // System.out.println(sum);

        // Easy

        // Shape s1 = new Circle(11,"Circle");
        // Shape s2 = new Rectangle(11 , 12,"Rectangle");

        // s1.displayDescription();
        // System.out.println("Area is: "+s1.calculateArea());

        // s2.displayDescription();
        // System.out.println("Area is: "+s2.calculateArea());

    }
}
