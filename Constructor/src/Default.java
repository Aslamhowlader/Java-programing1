
class Student {
    String name;
    int id;
    Student()
    {
        name="Aslam howlader";
        id=12;
    }
}

public class Default {
    public static void main(String[] args) {
        Student s1 = new Student();


        System.out.println("Name: " + s1.name);
        System.out.println("ID: " + s1.id);
    }
}