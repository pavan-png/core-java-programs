public class String_Eg61 {
    public static void main(String[] args) {

        // StringBuilder object is created in Heap memory
        // StringBuilder is MUTABLE (content can be changed)
        StringBuilder str = new StringBuilder("pavan kalyan ");

        // Passing the reference VALUE of str to the method
        change(str);

        // Since StringBuilder is mutable,
        // the change done inside the method is visible here
        System.out.println(str);
    }

    private static void change(StringBuilder s) {

        // append() modifies the SAME StringBuilder object
        // No new object is created
        // Both 'str' and 's' refer to the SAME object
        s.append(" good morning");
    }
}
