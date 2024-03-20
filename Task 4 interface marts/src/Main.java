public class Main {
    public static void main(String[] args) {
        Square s1 = new Square(5, 5);
        Circle c1 = new Circle(2);


        System.out.println("Arealet af en Square: " + s1.getArea());
        System.out.println("Arealet af en Circle: " + c1.getArea());

        ShapeBuilder b1 = new ShapeBuilder();
        b1.addShape(s1);
        b1.addShape(c1);

        double totalArea = b1.getTotalArea();
        System.out.println("TotalAreal af shapes: " + totalArea);
    }

}