package geometry;

public class Rectangle extends Figure{
    double width, length;

    public Rectangle(double width, double length) throws Exception {
        if(width<0 || length <0)
            throw new Exception("длина и ширина прямугольника не могут быть отрицательными!");
        if(width==0 || length ==0)
            throw new Exception("длина и ширина не могут быть 0");
        this.width = width;
        this.length = length;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", length=" + length +
                '}';
    }

    @Override
    public double perimeter() {
        return 0;
    }

    @Override
    public double area() {
        return 0;
    }
}
