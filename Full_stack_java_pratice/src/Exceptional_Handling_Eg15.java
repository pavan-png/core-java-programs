
public class Exceptional_Handling_Eg15 {
    static String s = "";
    // static variables can be re-intialized final cant
    public static void main(String[] args) {
        try {
            s += "1";
            throw new Exception();
            // if an exception is thrown either it should be ducked or handled . it is  handled below
        }
        catch(Exception e) {
            s += "2";
        }
        finally {
        s += "3";
        doStuff(); // since exception is not handled , abnormal termination.
        s += "4";
        }
System.out.println(s);
    }

    static void doStuff() {
        int x = 0;
        int y = 7 / x;
    }
}
