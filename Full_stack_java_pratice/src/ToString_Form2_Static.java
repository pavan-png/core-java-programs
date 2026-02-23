public class ToString_Form2_Static {

    public static void main(String[] args) {

        // 🔷 Converting primitive values to String using static toString()

        String s1 = Integer.toString(100);
        String s2 = Double.toString(25.75);
        String s3 = Boolean.toString(true);
        String s4 = Character.toString('A');
        String s5 = Long.toString(5000L);
        String s6 = Float.toString(12.5f);
        String s7 = Short.toString((short)20);
        String s8 = Byte.toString((byte)10);

        // Printing converted String values
        System.out.println("Integer to String: " + s1);
        System.out.println("Double to String: " + s2);
        System.out.println("Boolean to String: " + s3);
        System.out.println("Character to String: " + s4);
        System.out.println("Long to String: " + s5);
        System.out.println("Float to String: " + s6);
        System.out.println("Short to String: " + s7);
        System.out.println("Byte to String: " + s8);

        /*
         Important Concept:
         Static toString() converts primitive value directly to String.
         It does not require wrapper object creation.
        */
    }
}