public class Pass_By_Reference_Example {

    /*
     *  The original value of 'a' will be changed as we are trying
     *  to pass the objects. Objects are passed by reference.
     */

    int a = 10;
    void call(Pass_By_Reference_Example eg) {
        eg.a = eg.a+10;
    }

    public static void main(String[] args) {

        Pass_By_Reference_Example eg = new Pass_By_Reference_Example();
        System.out.println("Before call-by-reference: " + eg.a);

        // passing the object as a value using pass-by-reference
        eg.call(eg);
        System.out.println("After call-by-reference: " + eg.a);


    }
}