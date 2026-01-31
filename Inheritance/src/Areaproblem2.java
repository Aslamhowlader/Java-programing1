class area {
    public double h, w;

    // Default constructor
    public area() {
        this(2, 3);  // call parameterized constructor
    }

    // Parameterized constructor
    public area(double h, double w) {
        this.h = h;
        this.w = w;
    }

    // Copy constructor
    public area(area ob) {
        this.h = ob.h;
        this.w = ob.w;
    }

    // Calculate area of triangle
    public double display() {
        return h * w * 0.5;
    }
}

class rect1 extends area {
    // Default constructor
    public rect1() {
        super();
    }

    // Parameterized constructor
    public rect1(double h, double w) {
        super(h, w);  // pass h,w to parent
    }

    // Copy constructor
    public rect1(rect1 ob) {
        super(ob);  // call parent copy constructor
    }
}

public class Areaproblem2 {
    public static void main(String[] args) {
        rect1 r1 = new rect1();          // default constructor
        rect1 r2 = new rect1(3, 5);      // parameterized constructor
        rect1 r3 = new rect1(r2);        // copy constructor

        System.out.println("Area r1: " + r1.display());
        System.out.println("Area r2: " + r2.display());
        System.out.println("Area r3: " + r3.display());
    }
}