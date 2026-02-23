/*
 * Static import is used to import static members (methods/variables)
 * of a class so that we can use them without the class name.
 *
 * Here we are importing all static members of Math class.
 */
import static java.lang.Math.*;

public class With_Static_Import {

    public static void main(String[] args) {

        // sqrt() is a static method of Math class.
        // It returns the square root of the given number.
        System.out.println(sqrt(10));

        // max() is a static method of Math class.
        // It returns the larger value among the given numbers.
        System.out.println(max(15, 80));

        // random() is a static method of Math class.
        // It returns a random double value between 0.0 (inclusive) and 1.0 (exclusive).
        System.out.println(random());
    }
}