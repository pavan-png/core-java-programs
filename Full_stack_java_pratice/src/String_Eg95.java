public class String_Eg95 {
    public static void main(String[] args) {

        // StringBuilder object is created with value "java"
        StringBuilder sb = new StringBuilder("java");

        // toString() creates a NEW String object from StringBuilder
        String s = sb.toString();

        // toString() is called again → creates ANOTHER new String object
        String s1 = sb.toString();

        // == checks reference (memory address), NOT content
        System.out.println(s == s1);
    }
}
