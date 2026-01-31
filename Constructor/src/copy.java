class  copy1{
    int id;
    int sec;
    copy1(int id,int sec)
    {
        this.id=id;
        this.sec=sec;
    }
    copy1(copy1 ob)
    {
        this.id=ob.id;
        this.sec= ob.sec;
    }
    void display(){
        System.out.printf("id:"+id+"Sec:"+sec);
    }
}


public class copy {
    public static void main(String[] args) {
        copy1 ob=new copy1(12,1);
        ob.display();
        copy1 ob1=new copy1(ob);
        ob1.display();
    }
}
