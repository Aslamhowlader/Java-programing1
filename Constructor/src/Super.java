
/*🎯 তুমি এখানে যা শিখেছো:
✅ extends দিয়ে inheritance
✅ super() দিয়ে parent constructor call
✅ super.method() দিয়ে parent method call
✅ Method overriding

*/

class Student4 {
    int id;
    int sec;
    int intake;

    Student4() {
        id = 12;
        sec = 1;
        intake = 53;
    }

    Student4(int a, int b, int c) {
        intake = a;
        id = b;
        sec = c;
    }

    void display() {
        System.out.println("ID: " + id);
        System.out.println("Intake: " + intake);
        System.out.println("Section: " + sec);
    }
}

class Student5 extends Student4 {
    String name;
    int room;

    Student5() {
        super();   // calls Student4()
        name = "Aslam Howlader";
        room = 520;
    }

    Student5(String name, int room) {
        super(53, 12, 1);  // calls parameterized constructor
        this.name = name;
        this.room = room;
    }

    @Override
    void display() {
        super.display();   // parent class display
        System.out.println("Name: " + name);
        System.out.println("Room: " + room);
    }
}

public class Super {
    public static void main(String[] args) {
        Student5 ob = new Student5();
        ob.display();
    }
}