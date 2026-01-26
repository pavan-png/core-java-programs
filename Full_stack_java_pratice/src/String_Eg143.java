public class String_Eg143 {
    public static void main(String[] args) {

        // Wrapper class Integer is IMMUTABLE
        // x refers to an Integer object with value 400
        Integer x = 400;

        // y is assigned the SAME reference as x
        // Both x and y point to the SAME Integer object (400)
        Integer y = x;

        // x++ means:
        // 1) unboxing happens → int value is incremented
        // 2) a NEW Integer object with value 401 is created
        // 3) x now points to the NEW object
        // y still points to the old object (400)
        x++;

        // StringBuilder is MUTABLE
        // sb1 refers to a StringBuilder object with content "123"
        StringBuilder sb1 = new StringBuilder("123");

        // sb2 is assigned the SAME reference as sb1
        // Both point to the SAME StringBuilder object
        StringBuilder sb2 = sb1;

        // append("5") modifies the SAME object
        // Content becomes "1235"
        sb1.append("5");

        // (x == y)
        // x points to Integer(401)
        // y points to Integer(400)
        // Different objects → false
        //
        // (sb1 == sb2)
        // Both references point to the SAME object
        // Hence true
        System.out.println((x == y) + " " + (sb1 == sb2)); // false true
    }
}
