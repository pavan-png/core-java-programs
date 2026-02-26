import java.io.IOException;

class ReadTheFile {

    // Step 1:
    // This method declares a CHECKED exception (IOException).
    // So any caller of this method must:
    //   ✔ Handle it using try-catch
    //   OR
    //   ✔ Declare it using throws (ducking)

    static void print() throws IOException {

        // Step 2:
        // Explicitly throwing checked exception
        throw new IOException();
    }
}

public class Exception_Eg20 extends ReadTheFile {

    public static void main(String[] args) throws Exception {

        /*
         Step 3:
         main() is calling print().

         print() declares:
             throws IOException  (checked exception)

         So main() must either:
             ✔ catch IOException
             OR
             ✔ declare throws IOException
             OR
             ✔ declare a broader exception (like Exception)

         Here we declared:
             throws Exception

         This is VALID because:

         IOException is a subclass of Exception.

         Hierarchy:
             Exception
                ↑
             IOException

         So ducking a broader exception is allowed.
        */

        print();  // Step 4: Calling method that throws IOException
    }
}