interface Go{
    public void go();
}
class Sente implements Go{
    @Override
    public void go() {
        System.out.println("go in sente");
    }
}
class Goban extends Sente{
    @Override
    public void go() {
        System.out.println("go in goban");
    }
}
class Stone extends Goban implements Go{
/* Stone class is extending Goban and implementing Go , but the extending  clas Goban already has implementation for

  fpr method go() of interface Go so no compile time error.
 */
}
public class Extending_Class_Implementing_Interface {
    public static void main(String[] args) {
        Sente a = new Sente();
        a.go();
        //method call is made based on runtime objecct
        Goban b = new Goban();
        b.go();
        Stone c = new Stone();
        /* since stone extends Goban class , all the methods in Goban can be available in Stone also
        so by creating stone object we can call method go().
         */
        c.go();

    }
}
