class Parent11{
    int a ;
    int b;
    Parent11(){
        System.out.println("this is empty parent class constructor");
        a = 10;
        b = 20;
    }
    Parent11(int a , int b){
        System.out.println("this  is parameterized parent class constructor");
        this.a = a;
        this.b = b;

        System.out.println("a = "+a);
        System.out.println("b = "+b);
    }
}
class Child12 extends Parent11{
    int x;
    int y;
    Child12(){
        System.out.println("this is empty child class constructor");
        x = 111;
        y = 222;

    }
    Child12(int x , int y){
        System.out.println("this is parameterized  child class constructor ");
        this.x = x;
        this.y = y;
        System.out.println("x = "+x);
        System.out.println("y = "+y);
    }

}
public class Constructor_Working_During_Inheritance_Eg3 {
    public static void main(String[] args) {
        Child12 ref = new Child12(1111,2222);
    }
}
