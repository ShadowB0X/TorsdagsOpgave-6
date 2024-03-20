public class Square implements Shape {

    double længde;
    double bredte;

    Square(double længde, double bredte) {
        this.længde = længde;
        this.bredte = bredte;
    }


    @Override
    public double getArea() {
        double sum = længde * bredte;

        return sum;
    }
}
