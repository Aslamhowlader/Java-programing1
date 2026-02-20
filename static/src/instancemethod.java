// instance method
class C{
   int add(int a,int b)
   {
       return a+b;
   }
   void get()
   {
       System.out.println("Hello Aslam");
   }
}




public class instancemethod {
    public static void main(String[] args) {
        C ob=new C();
        int c=ob.add(3,5);
        System.out.println(c);
        ob.get();
    }

}
