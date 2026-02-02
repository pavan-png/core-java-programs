class Parent1 {
    int a;
    int b;

    Parent1() {
        a = 10;
        b = 20;
        System.out.println("parent class default constructor a = " + a);
        System.out.println("parent class default constructor b = " + b);
    }

    Parent1(int a, int b) {
        this.a = a;
        this.b = b;
        System.out.println("parent class parameterized constructor a = " + a);
        System.out.println("parent class parameterized constructor b = " + b);
    }
}

class Child1 extends Parent1 {
    int x;
    int y;

    Child1() {
        x = 111;
        y = 222;
        System.out.println("child class default constructor x = " + x);
        System.out.println("child class default constructor y = " + y);
    }

    Child1(int x, int y) {
        this.x = x;
        this.y = y;
        System.out.println("child class parameterized constructor x = " + x);
        System.out.println("child class parameterized constructor y = " + y);
    }
}

public class Constructor_Working_During_Inheritance_Eg2 {
    public static void main(String[] args) {
        Child1 ref = new Child1();
    }
}
