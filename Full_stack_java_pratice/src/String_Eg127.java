public class String_Eg127 {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("One Two Three Four Five");
        System.out.println(sb.reverse().indexOf("Two"));
        // here each and every character is reversed , so Two would never be found by jvm so it returns -1

        System.out.println(sb);
        System.out.println(sb.reverse().indexOf("Two"));
        System.out.println(sb);
         // if reversed again original data would come . since change will be happened in the same object in StringBuffer.
        // And index of method will return 4 . before the word "Two" index of each character is counted , and Two  is taken
        // 4th index.
    }
}
