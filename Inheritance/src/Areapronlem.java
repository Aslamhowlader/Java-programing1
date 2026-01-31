
/*Concepts Learned:

Constructor Overloading

Copy Constructor

Inheritance

super() keyword

Encapsulation (private fields)

 */


class  Area{
    private  int h,w;
    Area()
    {
        h=2;
        w=3;
    }
    Area(int h,int w)
    {
        this.h=h;
        this.w=w;
    }
    Area( Area ob)
    {
        this.h=ob.h;
        this.w=ob.w;

    }
    void  display()
    {
     int A=h*w;
        System.out.println("Area:"+A);
    }
}
class rect extends Area{
    rect()
    {
        super();
    }
    rect(int h,int w )
    {
        super(h,w);
    }
    rect( rect ob)
    {
        super(ob);
    }
}

public class Areapronlem {
    public static void main(String[] args) {
        rect ob = new rect();
        ob.display();
        rect ob1 = new rect(2,4);
        ob1.display();
        rect ob2 = new rect(3,6);
        ob2.display();
    }
}
