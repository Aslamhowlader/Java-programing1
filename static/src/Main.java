//instance variable
// instance method
//Static variable
//Static method
//Static Block
//Local variable

class A{
    int id; //instance variable id=0
    String name;//instance variable name=null
    static String uni_name;//Static variable
    A(int i,String n)
    {
        name=n;
        id=i;
    }
    void  display()
    {

        System.out.println(name);
        System.out.println(id);
        System.out.println(uni_name);
    }
}
public class Main {
    public static void main(String[] args) {
        A ob = new A(23 ,"Asalm");
        //ob.id=12;
        //ob.name="Aslam";
      //  A.uni_name="BUBT";
        ob.display();
        A ob1 =new A(4,"Salam");
         //ob1.id=134;
        // ob1.name="Salam";
       // A.uni_name="BUBT";
        ob1.display();
    }
}