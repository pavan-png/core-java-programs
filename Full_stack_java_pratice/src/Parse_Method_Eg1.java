public class Parse_Method_Eg1 {

    public static void main(String[] args) {

        // 🔷 Integer parse method
        // Converts String to primitive int
        int i = Integer.parseInt("10");
        System.out.println("int value: " + i);


        // 🔷 Long parse method
        // Converts String to primitive long
        long l = Long.parseLong("1000");
        System.out.println("long value: " + l);


        // 🔷 Short parse method
        // Converts String to primitive short
        short s = Short.parseShort("50");
        System.out.println("short value: " + s);


        // 🔷 Byte parse method
        // Converts String to primitive byte
        byte by = Byte.parseByte("20");
        System.out.println("byte value: " + by);


        // 🔷 Float parse method
        // Converts String to primitive float
        float f = Float.parseFloat("12.5");
        System.out.println("float value: " + f);


        // 🔷 Double parse method
        // Converts String to primitive double
        double d = Double.parseDouble("24.0");
        System.out.println("double value: " + d);


        // 🔷 Boolean parse method
        // Returns true only if string equals "true" (ignoring case)
        boolean b1 = Boolean.parseBoolean("true");
        System.out.println("boolean value (true): " + b1);

        boolean b2 = Boolean.parseBoolean("abc");
        System.out.println("boolean value (abc): " + b2);  // false


        // 🔷 Character
        // There is NO parseChar() method in Java.
        // To convert String to char, we use charAt(0).

        char ch = "A".charAt(0);
        System.out.println("char value: " + ch);


        // If invalid numeric String is given,
        // NumberFormatException will occur.
        // Example:
        // int x = Integer.parseInt("ten");  // Exception
    }
}