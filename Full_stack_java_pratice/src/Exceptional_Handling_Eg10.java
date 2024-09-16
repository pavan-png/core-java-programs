
class TestException extends Exception {
    /*
    here TestException is a user defined exception, if it is user defined exception then it should extend
    Exception class.
    Exception is a partially checked Exception
    Partially checked exception is such a parent Exception class where its child consists of both checked and unchecked
    exception classes .
    if it is partially checked it needs to be handled compulsorily
     */
    public TestException() {
        super();

    }

    public TestException(String s) {
        super(s);

    }

}

public class Exceptional_Handling_Eg10 {

    /*
    here we are ducking ( saying that the fellow who will call m1 method should handle it )the exception
    using throws keyword
    when ducking an exception should either use same Exception (or) its parent type( Should use either TestException
    or its parent) after throws keyword.
     */
    public void m1() throws Exception {

        //here we are rethrowing the exception
        throw new TestException();
    }
    public static void main(String[] args) {

    }
}

