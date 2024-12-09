class Parent1{
int a ;
int b;
   Parent1(){
        System.out.println("this is empty parent class constructor");
        a = 10;
        b = 20;
    }
    Parent1(int a , int b){
        System.out.println("this  is parameterized child class constructor");
        this.a = a;
        this.b = b;

        System.out.println("a = "+a);
        System.out.println("b = "+b);
    }
}
class Child1 extends Parent1{
    int x;
    int y;
    Child1(){
        System.out.println("this is empty child class constructor");
        x = 111;
        y = 222;

    }
    Child1(int x , int y){
        System.out.println("this is parent class constructor ");
        this.x = x;
        this.y = y;
        System.out.println("x = "+x);
        System.out.println("y = "+y);
    }

}
public class Constructor_Working_During_Inheritance_Eg2 {
    public static void main(String[] args) {
        Child1 ref = new Child1();
    }
}
