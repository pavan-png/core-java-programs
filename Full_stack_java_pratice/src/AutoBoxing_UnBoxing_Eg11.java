public class AutoBoxing_UnBoxing_Eg11 {
    public static void main(String[] args) {
        boolean a = new Boolean((Boolean.valueOf(args[0])));
        System.out.println(a);
        boolean b = new Boolean(new Boolean(args[1]));
        System.out.println(b);
    }
}
