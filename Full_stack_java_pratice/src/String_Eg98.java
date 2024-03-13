public class String_Eg98 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        System.out.println(sb.append("").append("").append("").append("").length());
        // null pointer exception comes when there is no object and we are trying to perform operation on it .
        // here object is declared line 3 so no NullPointerException.
    }
}
