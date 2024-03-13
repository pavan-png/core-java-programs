public class String_Eg101 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder(100);
        System.out.println(sb.length() + " : " + sb.toString().length());
        /*
        capacity  = no of locations available .
        store = no of location occupied .
        sb has no data so length will be 0 : sb has np data we are converting to string and applied length so 0
         */
    }
}
