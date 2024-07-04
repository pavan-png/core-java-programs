public class String_Eg134 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder(-32); // if string is number is given instead of String , it is treated
        // as capacity. capacity cannot be negative it leads to NegativeArraySizeException

        System.out.println(sb.append("AbC"));
    }
}
