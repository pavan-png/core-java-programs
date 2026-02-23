public class ValueOf_Method_Eg2 {
    public static void main(String[] args) {

        // Default radix is 10 (decimal number system)
        // "1111" is treated as base 10
        // So value remains 1111
        Integer i1 = Integer.valueOf("1111");
        System.out.println("Default base 10: " + i1);


        // "11111" in base 4
        // Formula:
        // digit × (radix ^ position)

        // 1×4^4 + 1×4^3 + 1×4^2 + 1×4^1 + 1×4^0
        // = 1×256 + 1×64 + 1×16 + 1×4 + 1×1
        // = 256 + 64 + 16 + 4 + 1
        // = 341

        Integer i2 = Integer.valueOf("11111", 4);
        System.out.println("Base 4 value: " + i2);


        // "11" in base 36
        // 1×36^1 + 1×36^0
        // = 36 + 1
        // = 37
        Integer i4 = Integer.valueOf("11", 36);
        System.out.println("Base 36 value: " + i4);


        // "0" in base 35
        // 0 × anything = 0
        Integer i5 = Integer.valueOf("0", 35);
        System.out.println("Base 35 value: " + i5);


        // This will throw NumberFormatException
        // Because "ten" is not a valid numeric string
        // Execution will stop here
        Integer i3 = Integer.valueOf("ten");
        System.out.println(i3);


        // This line will NOT execute
        // Because exception occurs above
        // "10" in base 5
        // = 1×5 + 0
        // = 5
        Integer i6 = Integer.valueOf("10", 5);
        System.out.println("Base 5 value: " + i6);
    }
}