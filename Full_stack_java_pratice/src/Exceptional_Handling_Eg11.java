import java.io.FileNotFoundException;
import java.io.IOException;
abstract class Super {
    public abstract void m1() throws IOException;
}
class Sub extends Super {
    @Override
    public void m1() throws IOException {
        /*
        since the child method throws IOException the parent method should also throw same exception
        (or) its parent exception
         */



        /* FileNotFoundException is a checked exception , if it is  a checked exception , it needs to handled
        if it is throwing it needs to be handled , at the place where you make a call to the m1 method.
         */
        throw new FileNotFoundException();

    }
}
public class Exceptional_Handling_Eg11 {
    public static void main(String[] args) {
        // loose coupling
        Super s = new Sub();

        try {
            s.m1();
        }
        /*
        one try block can have multiple catch block , but the hierarchy should be in a such a way that
        it should be from child to parent.
        ( in the first case it should be child , when you come down the ladder it should be parent)
        otherwise it results in compilation error like below
         */

        catch (IOException e) {
            System.out.print("A");
        }
        /* catch(FileNotFoundException e) {
            System.out.print("B");
        }

         */
        finally {
            System.out.print("C");

        }

    }

}

