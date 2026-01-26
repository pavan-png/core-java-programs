public class String_Eg125 {
    public static void main(String[] args) {

        // StringBuffer is mutable
        // Initial content of sb is "11111"
        StringBuffer sb = new StringBuffer("11111");

        // insert(int offset, boolean b)
        // offset = 3 → insertion starts at index 3
        // Index positions: 0 1 2 3 4
        // Characters:      1 1 1 1 1
        // false is converted to String "false"
        // Result → "111false11"
        sb.insert(3, false);

        // insert(int offset, double d)
        // offset = 5
        // Current string: "111false11"
        // 3.3 is converted to String "3.3"
        // Result → "111fa3.3lse11"
        sb.insert(5, 3.3);

        // insert(int offset, String str)
        // offset = 7
        // "one" is inserted at index 7
        // Final result → "111fa3.one3lse11"
        sb.insert(7, "one");

        // StringBuffer methods return the SAME object reference
        // Hence method chaining is possible
        System.out.println(sb);

        // NOTE:
        // offset → index position where insertion happens
        // data → value to be inserted (converted to String if needed)
        // Index always starts from 0
    }
}
