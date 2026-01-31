/*Concepts Learned

Encapsulation (private fields)

Inheritance (extends)

Constructor overloading

Copy constructor

super() keyword

Method overriding/usage in subclass

 */



class Box{
    private  int h,w,d;
    Box()
    {
        h=w=d=3;

    }
    Box(int h,int w,int d)
    {
        this.h=h;
        this.w=w;
        this.d=d;
    }
    Box(Box ob)
    {
        this.h=ob.h;
        this.w= ob.w;
        this.d=ob.d;
    }
    int volume()
    {
        return h*w*d;
    }
}
class Box1 extends Box{
    int weigt;
    Box1(){
        super();
        weigt=3;
    }
     Box1(int h,int w,int d,int weigt)
    {
        super(h,w,d);
        this.weigt=weigt;
    }
    Box1(Box1 ob)
    {
        super(ob);
        this.weigt=ob.weigt;
    }
    void  display()
    {
        System.out.println("Volume:"+volume()+"  "+"Wiegt :"+weigt);
    }

}


public class Box_problem {
    public static void main(String[] args) {
        Box1 ob=new Box1();
        Box1 ob1=new Box1(2,3,4,5);
        Box1 ob2=new Box1(ob1);
        ob.display();
        ob1.display();
        ob2.display();


    }
}
