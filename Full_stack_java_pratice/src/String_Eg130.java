public class String_Eg130 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("0123456789");
        System.out.println(sb.delete(3,6).deleteCharAt(4).deleteCharAt(5));
        //delete() deletes data from 3 index to (n-1) 6-1 = 5 index.
        // deleteCharAt() deletes character at specified index.
    }
}
