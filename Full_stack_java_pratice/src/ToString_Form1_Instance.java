public class ToString_Form1_Instance {

    public static void main(String[] args) {

        // 🔷 Creating wrapper objects
        Integer intObj = Integer.valueOf(100);
        Double doubleObj = Double.valueOf(25.75);
        Boolean boolObj = Boolean.valueOf(true);
        Character charObj = Character.valueOf('A');

        // 🔷 Explicit call of instance toString()
        String s1 = intObj.toString();
        String s2 = doubleObj.toString();
        String s3 = boolObj.toString();
        String s4 = charObj.toString();

        System.out.println("Explicit toString() calls:");
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(s4);


        // 🔷 Implicit call of toString()
        // println() automatically calls object.toString()

        System.out.println("\nImplicit toString() calls:");
        System.out.println(intObj);      // internally calls intObj.toString()
        System.out.println(doubleObj);   // internally calls doubleObj.toString()
        System.out.println(boolObj);     // internally calls boolObj.toString()
        System.out.println(charObj);     // internally calls charObj.toString()

        /*
         Important Concept:
         Wrapper classes override Object.toString().
         So they print the stored value,
         not memory address.
        */
    }
}