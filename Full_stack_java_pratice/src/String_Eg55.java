public class String_Eg55 {
    public static void main(String[] args) {

        // String literal → stored in String Constant Pool (SCP)
        String s1 = "Java";

        // new String() → creates a new String object in Heap
        String s2 = new String("java");

        // toLowerCase() converts the content to lowercase
        // IMPORTANT:
        // toLowerCase() RETURNS A NEW String object
        // It does NOT modify the original String (String is immutable)
        //
        // == compares REFERENCES (memory addresses), not content
        // Even though both strings become "java",
        // they are TWO DIFFERENT objects in memory
        if (s1.toLowerCase() == s2.toLowerCase()) {
            System.out.println("equal");
        } else {
            System.out.println("not equal");
        }

        // CORRECT WAY to compare content:
        // System.out.println(s1.toLowerCase().equals(s2.toLowerCase()));
    }
}
