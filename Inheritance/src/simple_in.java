class demo{
    int add(int a ,int b)
    {
        return a+b;
    }
    int sum(int a,int b)
    {
        return a-b;
    }
}
class calc extends demo{
    int mul(int a,int b)
    {
        return a*b;
    }
}

public class simple_in {
   public static void main(String[] args) {
           calc ob=new calc();
           int r1=ob.add(7,8);
           int  r2= ob.sum(4,5);
           int r3= ob.mul(2,3);
       System.out.printf("add="+r1+"\n"+"sum="+r2+"\n"+"mul="+r3);
    }
}