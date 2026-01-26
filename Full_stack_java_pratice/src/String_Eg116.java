public class String_Eg116 {
    public static void main(String[] args) {

        // String is immutable
        // s1 refers to a String object with value "ONE"
        String s1 = "ONE";

        // concat("TWO") creates a NEW String object "ONETWO"
        // But the returned reference is NOT stored in any variable
        // So the new object becomes eligible for garbage collection
        s1.concat("TWO");

        // concat("THREE") creates another NEW String object "ONETHREE"
        // Again, the reference is NOT collected
        // So this object also becomes eligible for garbage collection
        s1.concat("THREE");

        // s1 still points to the original String object "ONE"
        // Hence output remains unchanged
        System.out.println(s1);   // prints "ONE"
    }
}
