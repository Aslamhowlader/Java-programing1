
/*🎯 তুমি এখানে যা শিখছো:

✅ Constructor Overloading
✅ this keyword
✅ Object creation
✅ Method calling
*/

class Student2 {
    int id;
    String name;
    int Sec;
    int intake;
    int room;

    Student2() {
        id = 12;
        Sec = 1;
        intake = 53;

    }

    Student2(int id, int intake, String name) {
        this.id = id;
        this.intake = intake;
        this.name = name;
    }

    Student2(int room) {
        this.room = room;

    }

    void display() {
        System.out.println("Id:" + id+"\n"+"Name:"+name+"\n"+"Section:"+Sec+"\n"+"Intake:"+intake+"\n"+"Room:"+room);
    }

}

public class Overloading {
   public static void main(String[] args) {
       Student2 St4=new Student2();
       St4.display();
       System.out.println("----------------------------------------");
       Student2 St2=new Student2(12,53,"Aslam howlader");
       St2.display();
       System.out.println("----------------------------------------");
       Student2 St3=new Student2(520);
       St3.display();


    }
}
