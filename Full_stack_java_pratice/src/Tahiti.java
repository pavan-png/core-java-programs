public class Tahiti {

    // Instance variable of type Tahiti
    // Each Tahiti object will have its own 't' reference
    // Default value is null
    Tahiti t;

    // Instance method that accepts a Tahiti object reference
    Tahiti go(Tahiti t) {

        // Create first Tahiti object (new heap object)
        Tahiti t1 = new Tahiti();

        // Create second Tahiti object (new heap object)
        Tahiti t2 = new Tahiti();

        // t1's instance variable 't' now points to t2
        // Object t1 → t → Object t2
        t1.t = t2;

        // t2's instance variable 't' now points back to t1
        // Object t2 → t → Object t1 (circular reference)
        t2.t = t1;

        // Parameter 't' refers to the object passed from main()
        // That object's instance variable 't' now points to t2
        // mainObject → t → t2
        t.t = t2;

        // Return reference of t1 object to the caller
        return t1;
    }

    public static void main(String[] args) {

        // Create a Tahiti object in heap
        // Local reference 't' points to it
        Tahiti t = new Tahiti();

        // Call go() method using object 't'
        // Returned object reference (t1) is stored in t2
        Tahiti t2 = t.go(t);

        // Remove local reference t2
        // Object itself is NOT destroyed if it is still referenced elsewhere
        t2 = null;

        // more code here
    }
}
