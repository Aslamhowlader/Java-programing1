import javax.swing.plaf.synth.SynthOptionPaneUI;
/*🎯 তুমি এখানে যা শিখলে:
✅ Constructor Chaining (this(...))
✅ Constructor call must be first statement
✅ Clean object initialization

*/
class Student3{
    String name;
    int sec;
    int intake;
    int id;

    Student3(){
        this("Aslam howlader",12,1,53);

    }
    Student3(String name ,int id,int sec,int intake)
    {
        this(name);
        this.id=id;
        this.sec=sec;
        this.intake=intake;


    }
    Student3(String name)
    {
        this.name=name;
    }
    void  display()
    {
        System.out.printf("Name:"+name+"\n"+"Section:"+sec+"\n"+"Intake:"+intake+"\n"+"ID:"+id);
    }
}

public class Chaining  {
   public static void main(String[] args) {
       Student3 ob =new Student3();
       ob.display();
    }
}
