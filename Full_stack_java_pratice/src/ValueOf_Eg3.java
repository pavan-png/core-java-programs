public class ValueOf_Eg3 {

    public static void main(String[] args) {

        // 1️⃣ Integer
        // Creating Integer object from primitive
        System.out.println("Integer (primitive): " + Integer.valueOf(10));

        // Creating Integer object from String
        System.out.println("Integer (String): " + Integer.valueOf("20"));


        // 2️⃣ Byte
        System.out.println("Byte (primitive): " + Byte.valueOf((byte)5));
        System.out.println("Byte (String): " + Byte.valueOf("10"));


        // 3️⃣ Short
        System.out.println("Short (primitive): " + Short.valueOf((short)100));
        System.out.println("Short (String): " + Short.valueOf("200"));


        // 4️⃣ Long
        System.out.println("Long (primitive): " + Long.valueOf(1000L));
        System.out.println("Long (String): " + Long.valueOf("2000"));


        // 5️⃣ Float
        System.out.println("Float (primitive): " + Float.valueOf(10.5f));
        System.out.println("Float (String): " + Float.valueOf("20.5"));


        // 6️⃣ Double
        System.out.println("Double (primitive): " + Double.valueOf(99.99));
        System.out.println("Double (String): " + Double.valueOf("123.45"));


        // 7️⃣ Boolean
        // Returns true only if String equals "true" (ignoring case)
        System.out.println("Boolean (primitive): " + Boolean.valueOf(true));
        System.out.println("Boolean (String true): " + Boolean.valueOf("true"));
        System.out.println("Boolean (String other): " + Boolean.valueOf("abc"));  // false


        // 8️⃣ Character
        // Character supports only char type
        System.out.println("Character: " + Character.valueOf('a'));

        // Character does NOT support valueOf(String)
    }
}