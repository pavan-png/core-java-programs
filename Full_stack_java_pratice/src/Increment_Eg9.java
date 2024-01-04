public class Increment_Eg9 {
    public static void main(String[] args) {
        int a = 7;
        boolean result = a++ == 7              &&   ++a == 9        ||   a++ == 9;
         //             7 == 7 => true (8)       9 == 9 (true)       short circuit increment operator will not evaluate second condition if 1st condition is true
         System.out.println(a);
        System.out.println(result);
    }
}
