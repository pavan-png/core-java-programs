public class Xxx_Value_Method {

    public static void main(String[] args) {

        // Creating Integer object
        Integer i = Integer.valueOf(100);

        // Converting Integer object to different primitive types
        System.out.println("byteValue: " + i.byteValue());
        System.out.println("shortValue: " + i.shortValue());
        System.out.println("intValue: " + i.intValue());
        System.out.println("longValue: " + i.longValue());
        System.out.println("floatValue: " + i.floatValue());
        System.out.println("doubleValue: " + i.doubleValue());


        // 🔷 Overflow Example

        // Creating Integer object with value 130
        Integer i1 = Integer.valueOf(130);

        // Converting to byte
        byte b = i1.byteValue();

        System.out.println("Integer value: " + i1);
        System.out.println("After converting to byte: " + b);

        /*
         Byte range:
         Minimum = -128
         Maximum = 127
         Total values = 256

         Since 130 is greater than 127,
         overflow happens.

         Formula idea:
         result = minRange + (value - maxRange - 1)

         = -128 + (130 - 127 - 1)
         = -128 + 2
         = -126
        */


        // Example showing decimal loss
        Double d = Double.valueOf(123.99);
        System.out.println("Double to int (decimal removed): " + d.intValue());


        // Boolean conversion
        Boolean bool = Boolean.valueOf(true);
        System.out.println("booleanValue: " + bool.booleanValue());

        // Character conversion
        Character c = Character.valueOf('Z');
        System.out.println("charValue: " + c.charValue());
    }
}