class Parent11 {
    int a;
    int b;

    Parent11() {
        a = 10;
        b = 20;
        System.out.println("parent class default constructor a = " + a);
        System.out.println("parent class default constructor b = " + b);
    }

    Parent11(int a, int b) {
        this.a = a;
        this.b = b;
        System.out.println("parent class parameterized constructor a = " + a);
        System.out.println("parent class parameterized constructor b = " + b);
    }
}

class Child12 extends Parent11 {
    int x;
    int y;

    Child12() {
        x = 1111;
        y = 2222;
        System.out.println("child class default constructor x = " + x);
        System.out.println("child class default constructor y = " + y);
    }

    Child12(int x, int y) {
        this.x = x;
        this.y = y;
        System.out.println("child class parameterized constructor x = " + x);
        System.out.println("child class parameterized constructor y = " + y);
    }
}

public class Constructor_Working_During_Inheritance_Eg3 {
    public static void main(String[] args) {
        Child12 ref = new Child12(1111, 2222);
    }
}
