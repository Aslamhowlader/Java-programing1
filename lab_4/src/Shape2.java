/*
Create an abstract class Shape with abstract method area().
Create Circle and Rectangle classes that implement area().
*/

abstract class Shape1 {
    abstract void area();
}

class Circle1 extends Shape1 {
    double radius;

    Circle1(double radius) {
        this.radius = radius;
    }

    void area() {
        System.out.println("Circle Area: " + (3.14 * radius * radius));
    }
}

class Rectangle1 extends Shape1 {
    double h, w;

    Rectangle1(double w, double h) {
        this.h = h;
        this.w = w;
    }

    void area() {
        System.out.println("Rectangle Area: " + (h * w));
    }
}

public class Shape2 {
    public static void main(String[] args) {

        Shape1 c = new Circle1(5);
        Shape1 r = new Rectangle1(4, 6);

        c.area();
        r.area();
    }
}