 class  Student1{
    int id;
    String name;
    Student1(String name,int id) //Parameterized Constructor
    {
        this.name=name;
        this.id=id;
    }
    void display()
    {
        System.out.println("Name:"+name+"\n"+"ID:"+id);
    }

        }


public class Parameterized {
   public static void main(String[] args) {
        Student1 st=new Student1("Aslam howlader" ,12);
        st.display();
    }
}
