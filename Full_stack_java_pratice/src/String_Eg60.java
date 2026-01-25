public class String_Eg60 {
    public static void main(String[] args) {

        // String literal stored in String Constant Pool (SCP)
        String str = "pavan kalyan ";

        // Passing the reference VALUE of str to the method
        change(str);

        // String is immutable, so original string is NOT changed
        // str still points to "pavan kalyan "
        System.out.println(str);
    }

    private static void change(String s) {

        // concat() does NOT modify the existing String
        // It creates a NEW String object with appended content
        // But the returned reference is NOT stored anywhere
        s.concat(" good morning");

        // Since the new String reference is lost,
        // it becomes eligible for Garbage Collection
        // The original string remains unchanged
    }
}
