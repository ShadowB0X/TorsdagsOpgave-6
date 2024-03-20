public class Circle implements Shape {

    double radius;

    Circle(double radius) {
        this.radius = radius;
    }


    @Override
    public double getArea() {

        double pi = 3.14;
        double sum = pi *radius * radius;


        return sum;
    }

    }



