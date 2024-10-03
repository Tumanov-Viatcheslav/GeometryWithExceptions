package geometry;

import java.util.Objects;

public class Rectangle extends Figure{
    double width, length;

    public Rectangle(double width, double length) throws GeometryException {
       // if(width<0 || length <0)
       //     throw new GeometryException("длина и ширина прямугольника не могут быть отрицательными!");
        if(width < 0)
            throw new NegativeLengthException("ширина не может быть отрицательной!!!", width);
        if(length < 0)
            throw new NegativeLengthException("длина не может быть отрицательной!!!", length);
        if(width==0 || length ==0)
            throw new ZeroLengthException("длина и ширина не могут быть 0");
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
        return 2*(width+length);
    }

    @Override
    public double area() {
        return width*length;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Rectangle rectangle)) return false;
        return Double.compare(width, rectangle.width) == 0 && Double.compare(length, rectangle.length) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(width, length);
    }
}
