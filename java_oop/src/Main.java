
class Student{
    int a=12;    // instance variable
    int b=11;    // instance variable
    void display()    // methods
    {
        System.out.println(a);
    }
}


public class Main {
    public static void main(String[] args) {
       Student ob = new Student();
       ob.display();
       ob.a=127;
       ob.b=100;
       System.out.println(ob.a);
        System.out.println(ob.b);


    }

}


