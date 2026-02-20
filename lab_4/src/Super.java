class preant{
     int x=12;
}
class child1 extends preant{
     int y=13;
    void show()
    {
        System.out.println(super.x);
        System.out.println(y);

    }


}

public class Super {
    public static void main(String[] args) {

        child1 ob =new child1();
        ob.show();

    }
}
