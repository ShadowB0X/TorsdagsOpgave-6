import java.util.ArrayList;

public class ShapeBuilder implements Shape{

    ArrayList<Shape> shapes = new ArrayList<>();

    ShapeBuilder(){

    }



    public void addShape(Shape s){
        shapes.add(s);
    }

    public double getTotalArea() {
        double totalArea = 0;
        for (Shape shape : shapes) {
            totalArea += shape.getArea();
        }
        return totalArea;
    }

    @Override
    public double getArea() {
        return 0;
    }
}
