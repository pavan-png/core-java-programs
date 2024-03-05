class Parent111{
    int a ;
    int b;
    Parent111(){
        System.out.println("this is empty parent class constructor");
        a = 10;
        b = 20;
    }
    Parent111(int a , int b){
        System.out.println("this  is parameterized parent class constructor");
        this.a = a;
        this.b = b;

        System.out.println("a = "+a);
        System.out.println("b = "+b);
    }
}
class Child112 extends Parent111{
    int x;
    int y;
    Child112(){
        System.out.println("this is empty child class constructor");
        x = 111;
        y = 222;

    }
    Child112(int x , int y){
        super(x,y);
        System.out.println("this is parameterized  child class constructor ");
        this.x = x;
        this.y = y;
        System.out.println("x = "+x);
        System.out.println("y = "+y);
    }

}
public class Constructor_Working_During_Inheritance_Eg4 {
    public static void main(String[] args)
    {
        Child112 ref = new Child112(1111,2222);
    }
}
