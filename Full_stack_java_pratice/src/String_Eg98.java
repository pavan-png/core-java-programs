public class String_Eg98 {
    StringBuilder sb1;
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        System.out.println(sb.append("").append("").append("").append("").length());
        // null pointer exception comes when there is no object and we are trying to perform operation on it .
        // here object is declared line 3 so no NullPointerException.
       String_Eg98 obj = new String_Eg98();
        obj.sb1.equals(sb);
        // here StringBuilder is declared, object is not created. if we try to perform operation on it, leads to NullPointerException


    }
}
