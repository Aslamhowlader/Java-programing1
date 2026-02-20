class Parent {
    void display() {
        System.out.println("Parent display");
    }
}

class Child extends Parent {
    void display() {
        System.out.println("Child display");
    }

    void show() {
         super.display();
        display();
    }
}

public class Test2 {
    public static void main(String[] args) {
        Child c = new Child();
        c.show();
    }
}