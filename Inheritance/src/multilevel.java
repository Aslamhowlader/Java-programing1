class father{

    void  show1()
    {
        System.out.println("Father class");
    }

}
class  son1 extends father{
    void show2(){
        System.out.println("Son1 class");
    }
}
class son2 extends son1{
    void show3()
    {
        System.out.println("Son2 class");
    }
}

public class multilevel {
    public static void main(String[] args) {
             son2 ob =new son2();
             ob.show1();
             ob.show2();
             ob.show3();
    }
}
