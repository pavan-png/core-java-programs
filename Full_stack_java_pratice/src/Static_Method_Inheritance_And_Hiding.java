class Parent_999 {

    // Static method 1: will be INHERITED by child
    public static void showInheritance() {
        System.out.println("Parent: static method participating in inheritance");
    }

    // Static method 2: will be HIDDEN by child
    public static void showHiding() {
        System.out.println("Parent: static method");
    }
}

class Child_999 extends Parent_999 {

    // This static method has the SAME signature as parent
    // This causes METHOD HIDING
    public static void showHiding() {
        System.out.println("Child: static method (method hiding)");
    }
}

public class Static_Method_Inheritance_And_Hiding {
    public static void main(String[] args) {

        Parent_999 obj = new Child_999();

        // -------- STATIC METHOD INHERITANCE --------
        // Child inherits this method from Parent
        Child_999.showInheritance();
        // Output: Parent: static method participating in inheritance

        // -------- STATIC METHOD HIDING --------
        // Decided using reference type (Parent_999)
        obj.showHiding();
        // Output: Parent: static method

        // Called using child class name
        Child_999.showHiding();
        // Output: Child: static method (method hiding)
    }
}
