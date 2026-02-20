
class E{
    {
        System.out.println("Instance block executed");
    }
    static {
        System.out.println("Static block executed");
    }
}


public class Block {
    public static void main(String[] args) {
           E ob =new E();
    }
}
