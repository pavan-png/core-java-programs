import java.io.FileNotFoundException;
import java.io.IOException;
abstract class Super1 {
    public abstract void m1() throws IOException;
}
class Sub1 extends Super1 {
    @Override
    public void m1() throws IOException {
        // while overriding we are exception ,it should be either same or its parent. so no problem

        throw new FileNotFoundException();

        }
}

public class Exception_Eg18 {
    public static void main(String[] args) {
        Super1 s = new Sub1();
        try {
            s.m1();
        }
        /*
        in catch while going down we should follow child to parent ladder.
         */
        catch (FileNotFoundException e) {

            // since the thrown exception object is FileNotFoundException this catch will execute.
            System.out.print("X");
        } catch (IOException e) {
            System.out.print("Y");
        } finally {
            System.out.print("Z");

        }

    }
}