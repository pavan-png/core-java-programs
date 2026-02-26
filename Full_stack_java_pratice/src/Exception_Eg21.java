import java.io.IOException;

class ReadTheFile_1 {

    // Step 1:
    // Method declares a CHECKED exception (IOException).
    // So any caller must either:
    //   ✔ handle it using try-catch
    //   OR
    //   ✔ declare it using throws
    static void print() throws IOException {

        // Step 2:
        // Explicitly throwing checked exception
        throw new IOException();
    }
}

public class Exception_Eg21 {

    public static void main(String[] args) {

        try {

            // Step 3:
            // Calling method that throws IOException.
            // Since IOException is checked,
            // it must be handled or declared.
            ReadTheFile_1.print();

        }

        /*
         Step 4:
         Catch blocks must follow CHILD → PARENT order.

         Hierarchy:
             Exception
                ↑
             IOException

         IOException is a subclass of Exception.

         So we must catch IOException first,
         and then catch Exception.
        */

        catch (IOException e) {

            // Step 5:
            // Actual thrown object is IOException.
            // This catch block matches exactly.
            System.out.println("io exception");

        } catch (Exception e) {

            /*
             This block will NOT execute in this case,
             because IOException is already caught above.

             If we reverse the order:
                 catch(Exception e)
                 catch(IOException e)

             It causes compile-time error:
             "Unreachable catch block"
            */

            System.out.println("general exception");
        }
    }
}