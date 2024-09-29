
public class Exception_Eg19 {
    private static void m1() {
        System.out.println(1/0);  // airthmetic exception unchecked

    }

    public static void main(String[] args) {
        try {
            m1();
        } finally {
            System.out.println("A");
        }
/*
even though there is no  throws or catch block why there is no compilation error ?
it applicable only for checked exceptions.
 */

    }

}
