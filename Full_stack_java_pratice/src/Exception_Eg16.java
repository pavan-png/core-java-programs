import java.io.FileNotFoundException;
import java.io.IOException;

abstract class Super1 {

    // Step 1:
    // Abstract method declaring checked exception (IOException)
    public abstract void m1() throws IOException;
}

class Sub1 extends Super1 {

    @Override
    public void m1() throws IOException {

        // Step 2:
        // While overriding, checked exception must be:
        // - Same type
        // - Or subclass (narrower)
        // Here we are throwing FileNotFoundException,
        // which is a subclass of IOException.
        // So this is VALID.

        throw new FileNotFoundException();
    }
}

public class Exception_Eg16 {

    public static void main(String[] args) {

        // Step 3:
        // Polymorphism: Super1 reference holding Sub1 object
        Super1 s = new Sub1();

        try {

            // Step 4:
            // Calling overridden method
            // At runtime Sub1's m1() executes
            s.m1();

        }
        /*
         Step 5:
         Catch blocks must follow child → parent order.
         Because FileNotFoundException is subclass of IOException.
         */

        catch (FileNotFoundException e) {

            // Step 6:
            // Actual thrown object is FileNotFoundException,
            // so this catch block executes.
            System.out.print("X");

        } catch (IOException e) {

            // This block will NOT execute
            // because the earlier catch already handled it.
            System.out.print("Y");

        } finally {

            // Step 7:
            // finally block ALWAYS executes
            System.out.print("Z");
        }
    }
}