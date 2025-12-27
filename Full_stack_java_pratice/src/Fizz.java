public class Fizz {

    int x = 5;
    // Instance variable x
    // Each Fizz object gets its own copy of x

    public static void main(String[] args) {

        final Fizz f1 = new Fizz();
        // f1 is a FINAL reference variable
        // Reference f1 cannot point to another Fizz object
        // BUT the object data can still be modified

        Fizz f2 = new Fizz();
        // f2 is a normal reference variable

        Fizz f3 = FizzSwitch(f1, f2);
        // f1 is passed as x
        // f2 is passed as y
        // Method returns a Fizz reference and assigns it to f3

        System.out.println((f2 == f3) + " " + (f2.x == f3.x));
        // (f2 == f3) → compares references
        // (f2.x == f3.x) → compares primitive values

        System.out.println(f2.x);
        // prints value of x in object referenced by f2

        System.out.println(f1.x);
        // prints value of x in object referenced by f1
    }

    static Fizz FizzSwitch(Fizz x, Fizz y) {

        final Fizz z = x;
        // z is a FINAL reference pointing to the SAME object as x
        // z and x refer to the same Fizz object

        z.x = 6;
        // Allowed:
        // final restricts reference reassignment, NOT object modification
        // This changes x value inside the object

        return z;
        // returns reference to the same object as f1
    }
}
