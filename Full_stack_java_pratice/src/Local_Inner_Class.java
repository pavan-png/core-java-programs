class Outer_4 {

    // 🔹 Outer class private variable
    private int outerData = 100;

    void display() {

        // 🔹 Local variable (effectively final)
        int localData = 50;

        // 🔹 Local Inner Class (declared inside method)
        // No access modifiers allowed here
        final class LocalInner {

            void show() {

                // ✔ Accessing private outer class member
                System.out.println("Outer variable: " + outerData);

                // ✔ Accessing local variable (effectively final)
                System.out.println("Local variable: " + localData);
            }
        }

        // Creating object inside same method
        LocalInner obj = new LocalInner();
        obj.show();

        System.out.println("----- Inside IF Block -----");

        // 🔹 Local Inner Class inside IF block
        if (true) {

            abstract class BlockInner {

                abstract void message();
            }

            // Anonymous class implementing abstract local class
            BlockInner blockObj = new BlockInner() {
                void message() {
                    System.out.println("Local inner class inside IF block");
                }
            };

            blockObj.message();
        }

        // ❌ Uncomment below to see compile-time error
        /*
        localData = 60;  // Now not effectively final

        class ErrorInner {
            void test() {
                System.out.println(localData); // ❌ Error
            }
        }
        */
    }
}

public class Local_Inner_Class {
    public static void main(String[] args) {

        Outer_4 o = new Outer_4();
        o.display();
    }
}
