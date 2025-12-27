public class Int_Char {
    public static void main(String[] args) {

        /*
         `char` in Java is an UNSIGNED 16-bit data type.
         Its valid range is:
         0 to 65535 (0x0000 to 0xFFFF)

         65535 is the MAXIMUM value a char can hold.
         Since 65535 is an int LITERAL within the char range,
         it can be directly assigned without typecasting.
        */
        char c = 65535;

        /*
         Any numeric value greater than 65535 or less than 0
         CANNOT be stored in a char.

         Attempting to assign such values will result in a
         COMPILE-TIME ERROR because they are outside the
         valid Unicode range for char.
        */

        /*
         A character literal like '�' represents a Unicode character.
         Internally, every character is stored as an integer code point.

         The Unicode value of '�' (replacement character) is 65533.

         Since `char` can be implicitly widened to `int`,
         storing a char literal into an int variable is ALWAYS allowed.
        */
        int a = '�'; // Unicode value = 65533
    }
}
