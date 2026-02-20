class  A {
    int a; //instance
    String uni_name;//instance

    A() {
        a = 14;
        uni_name = "Aslam howlader";
    }

    A(int i, String j) {
        a = i;
        uni_name = j;
    }
    A(A ob) {
        this.a = ob.a;
        this.uni_name = ob.uni_name;
    }
    void show() {
        System.out.println(a);
        System.out.println(uni_name);
    }

}
public class default1 {
    public static void main(String[] args) {
        A ob = new A();
        ob.show();
        A ob1 = new A(13,"fffff");
        ob1.show();
        A ob2 = new A(ob1);
        ob2.show();



    }
}
