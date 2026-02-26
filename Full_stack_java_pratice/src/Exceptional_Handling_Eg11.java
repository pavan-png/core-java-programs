import java.io.FileNotFoundException;
import java.io.IOException;

/*
 Step 1:
 Super class declares an abstract method.
 It declares: throws IOException.

 Important rule:
 When parent method declares a checked exception,
 child method must follow overriding rules.
*/
abstract class Super {

    public abstract void m1() throws IOException;
}


/*
 Step 2:
 Sub class overrides m1()
*/
class Sub extends Super {

    @Override
    public void m1() throws IOException {

        /*
         Overriding rule for checked exceptions:

         Child method can throw:
         ✔ Same exception (IOException)
         ✔ Its child exception (FileNotFoundException)
         ✔ No exception

         Child method CANNOT throw:
         ❌ Broader (parent) exception than parent method

         Since IOException is declared in parent,
         throwing FileNotFoundException is valid
         because:

         FileNotFoundException IS-A IOException
        */

        throw new FileNotFoundException();
    }
}


public class Exceptional_Handling_Eg11 {

    public static void main(String[] args) {

        /*
         Loose coupling:
         Reference type = Super
         Object type = Sub

         At compile time → method seen as Super.m1()
         At runtime → Sub.m1() executes
        */
        Super s = new Sub();

        try {

            /*
             s.m1() throws FileNotFoundException
             (which is a checked exception)

             Since FileNotFoundException extends IOException,
             and method declares throws IOException,
             we must handle IOException.
            */
            s.m1();
        }

        /*
         Catch block rule:

         When multiple catch blocks are used,
         order must be from CHILD to PARENT.

         Because:
         If parent is written first,
         child catch becomes unreachable.
        */
        catch (IOException e) {

            /*
             This block handles:
             - IOException
             - FileNotFoundException
             - Any subclass of IOException
            */
            System.out.print("A");
        }

        /*
         This is wrong order (commented in your code):

         catch(FileNotFoundException e)

         If we write IOException first,
         FileNotFoundException catch becomes unreachable,
         because it is already covered by IOException.

         That causes compilation error.
        */

        finally {

            /*
             Finally block always executes
             whether exception occurs or not.
            */
            System.out.print("C");
        }
    }
}