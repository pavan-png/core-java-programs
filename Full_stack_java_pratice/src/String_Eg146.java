public class String_Eg146 {
    public static void main(String[] args) {

        // new String("pavan") creates a String object in Heap memory
        // s1 refers to "pavan"
        String s1 = new String("pavan");

        // concat("kalyan") creates a NEW String object "pavankalyan"
        // Returned reference is NOT stored
        // Hence this new object becomes eligible for GC
        s1.concat("kalyan");

        // += operator is shorthand for:
        // s1 = s1 + " millionarie "
        // A NEW String object is created and reference is assigned to s1
        s1 += " millionarie ";

        // concat(", billionarie") is called on updated s1
        // A NEW String object is created
        // Reference is stored in s2
        String s2 = s1.concat(", billionarie");

        // s1 points to "pavan millionarie "
        System.out.println(s1);

        // s2 points to "pavan millionarie , billionarie"
        System.out.println(s2);
    }
}
