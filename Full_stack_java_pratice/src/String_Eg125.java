public class String_Eg125 {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("11111");
        System.out.println(sb.insert(3,false).insert(5,3.3).insert(7,"one"));
        // here offset is the index position where you want to insert , and the other parameter is the data that needs
        // to be inserted. and index starts from 0.

    }
}
