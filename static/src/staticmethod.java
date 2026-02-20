class D{

    static int add(int a,int b)
    {
        return a*b;
    }
    static void show()
    {
        System.out.println("Hello Aslam");
    }
}



public class staticmethod {
    public static void main(String[] args) {

       int b= D.add(3,4);
        System.out.println(b);
        D.show();
    }
}
