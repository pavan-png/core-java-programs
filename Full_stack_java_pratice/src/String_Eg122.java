public class String_Eg122 {
    public static void main(String[] args) {

        // StringBuffer is MUTABLE
        // sb refers to a StringBuffer object with content "11111"
        StringBuffer sb = new StringBuffer("11111");

        // append(22222) modifies the SAME object → "1111122222"
        // reverse() also modifies the SAME object → "2222211111"
        // append() returns the same object reference
        // reverse() also returns the same object reference
        // So sb1 and sb point to the SAME object
        StringBuffer sb1 = sb.append(22222).reverse();

        // Both references point to the SAME object
        System.out.println(sb1 == sb);   // true

        // sb content after append + reverse
        System.out.println(sb);          // 2222211111

        // sb1 content is the same because reference is same
        System.out.println(sb1);         // 2222211111


        // Creating a new StringBuffer object
        StringBuffer s = new StringBuffer("hello");

        // Creating another new StringBuffer object with same content
        // But this is a DIFFERENT object in memory
        StringBuffer s1 = new StringBuffer("hello");

        // == compares references, not content
        // s and s1 point to DIFFERENT objects
        System.out.println(s1 == s);     // false


        // Creating one StringBuffer object
        StringBuffer s11 = new StringBuffer("hello");

        // append("@") modifies the SAME object
        // append() returns the SAME reference
        StringBuffer s12 = s11.append("@");

        // s11 and s12 both point to the SAME object
        System.out.println(s11 == s12);  // true
    }
}
