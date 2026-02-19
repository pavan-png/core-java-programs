class Parent_00 {

    Parent_00() {

        // This constructor executes when Child object is created
        // Even though we are not creating Parent object separately,
        // Parent constructor runs to initialize parent part of Child object

        System.out.println("this is parent class constructor");

        // 'this' refers to the SAME Child object
        // No separate Parent object is created
        // It prints the hashCode (memory identity) of the Child object
        System.out.println(this.hashCode());
    }
}

class Child_1 extends Parent_00 {

    Child_1() {

        // Before this constructor runs,
        // JVM automatically adds super();
        // So Parent_00 constructor executes first

        System.out.println("this is child class constructor");

        // 'this' still refers to the SAME Child object
        // HashCode will be same as printed in Parent constructor
        System.out.println(this.hashCode());
    }
}

public class Objects_Created_During_Child_Class_Object_Creation {

    public static void main(String[] args) {

        // Only ONE object is created here → Child_1 object
        // But constructor execution order will be:
        // 1) Object class constructor
        // 2) Parent_00 constructor
        // 3) Child_1 constructor

        Child_1 obj = new Child_1();

        // This hashCode is same as printed above
        // Proves only ONE object is created
        System.out.println(obj.hashCode());
    }
}
