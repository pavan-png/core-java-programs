class Parent111 {
    int a;
    int b;

    Parent111() {
        a = 10;
        b = 20;
        System.out.println("parent class default constructor a = " + a);
        System.out.println("parent class default constructor b = " + b);
    }

    Parent111(int a, int b) {
        this.a = a;
        this.b = b;
        System.out.println("parent class parameterized constructor a = " + a);
        System.out.println("parent class parameterized constructor b = " + b);
    }
}

class Child112 extends Parent111 {
    int x;
    int y;

    Child112() {
        x = 111;
        y = 222;
        System.out.println("child class default constructor x = " + x);
        System.out.println("child class default constructor y = " + y);
    }

    Child112(int x, int y) {
        super(x, y); // explicit call to parent parameterized constructor
        this.x = x;
        this.y = y;
        System.out.println("child class parameterized constructor x = " + x);
        System.out.println("child class parameterized constructor y = " + y);
    }
}

public class Constructor_Working_During_Inheritance_Eg4 {
    public static void main(String[] args) {
        Child112 ref = new Child112(1111, 2222);
    }
}
