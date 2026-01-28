class Foo_0 {

    // Instance variable (object state)
    private int x;

    // Constructor initializes the object
    public Foo_0(int x) {
        this.x = x;
    }

    // Setter modifies object state
    public void setX(int x) {
        this.x = x;
    }

    // Getter returns object state
    public int getX() {
        return x;
    }
}

public class Gamma {

    /*
     Static method:
     - Receives a COPY of the reference passed from the caller
     - Reassigning 'foo' affects ONLY the local copy
     - Caller variable remains unchanged
    */
    static Foo_0 fooBar(Foo_0 foo) {

        // A NEW object is created
        // Local reference 'foo' now points to this new object
        foo = new Foo_0(100);

        // Returning the reference to the new object
        return foo;
    }

    public static void main(String[] args) {

        // Step 1: Create first object
        // foo -> object with x = 300
        Foo_0 foo = new Foo_0(300);

        // Prints value from original object
        System.out.print(foo.getX() + "-");   // 300-

        /*
         Step 2: Call fooBar(foo)
         - A COPY of foo's reference is passed
         - Inside fooBar(), the parameter is reassigned
         - Original 'foo' in main is NOT affected
         */
        Foo_0 fooFoo = fooBar(foo);

        // foo still points to original object (x = 300)
        System.out.print(foo.getX() + "-");   // 300-

        // fooFoo points to NEW object returned by fooBar (x = 100)
        System.out.print(fooFoo.getX() + "-"); // 100-

        /*
         Step 3: Assign result of fooBar(fooFoo) back to foo
         - fooBar receives copy of fooFoo reference
         - Creates another new object with x = 100
         - Returned reference is assigned to 'foo'
         */
        foo = fooBar(fooFoo);

        // foo now points to new object (x = 100)
        System.out.print(foo.getX() + "-");   // 100-

        // fooFoo still points to its original object (x = 100)
        System.out.print(fooFoo.getX());      // 100
    }
}
