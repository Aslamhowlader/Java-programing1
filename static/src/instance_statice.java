class B{
     static int count=0;

    void show()
    {
        count++;
        System.out.println(count);
    }

}

public class instance_statice {
    public static void main(String[] args) {
        B ob =new B();
        ob.show();
        B ob1 =new B();
        ob1.show();
        B ob2 =new B();
        ob2.show();
    }
}
