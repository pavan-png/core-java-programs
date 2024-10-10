public class Exceptional_Handling_Eg25 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder(); // capacity = 16
        try {
            for (;;){ // results in infinite loop
                sb.append("hello"); // stores in heap infinite times  (OutOfMemoryError) = > ErrorClass
            }
        }
        catch (Exception e) {
            System.out.println("Exception");
        }
        System.out.println("amundi ley inka paduko");
    }
}
