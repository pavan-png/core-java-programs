class Animal_1 {

    // Parent class method
    // This method can be overridden by child classes
    public String noise() {
        return "peep";
    }
}

class Dog_4 extends Animal_1 {

    // Overridden method
    // Executed when runtime object is Dog_4
    public String noise() {
        return "bark";
    }
}

class Cat_1 extends Animal_1 {

    // Overridden method
    // Executed when runtime object is Cat_1
    public String noise() {
        return "meow";
    }
}

public class Inheritance_Eg16 {

    public static void main(String[] args) {

        // Step 1:
        // Upcasting
        // Reference type → Animal_1
        // Runtime object → Cat_1
        Animal_1 obj = new Cat_1();

        // Step 2:
        // Upcasting
        // Reference type → Animal_1
        // Runtime object → Dog_4
        Animal_1 obj1 = new Dog_4();

        /*
         IMPORTANT NOTES:
         - For safe downcasting, upcasting must have happened earlier
         - Type casting changes only the reference type, not the object
         - There must be a parent–child (IS-A) relationship to type cast
         */

        // Step 3:
        // Downcasting
        // obj is pointing to a Cat_1 object at runtime
        // So casting to Cat_1 is SAFE
        Cat_1 c = (Cat_1) obj;

        // Step 4:
        // Method call on child reference
        // Overridden method execution is decided by runtime object
        // Runtime object is Cat_1
        System.out.println(c.noise()); // prints "meow"
    }
}
