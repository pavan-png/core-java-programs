public class AutoBoxing_Unboxing_Eg5 {
    public static void main(String[] args) {
        Integer x = new Integer(5);
        Integer y = new Integer(5);
        System.out.println(x==y);// false
        // here by using new two times two objects will be created and therefore their references are
        // not pointing to the same object so false
    }
}
