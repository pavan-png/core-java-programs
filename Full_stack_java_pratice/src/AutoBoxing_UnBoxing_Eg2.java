public class AutoBoxing_UnBoxing_Eg2 {
    static  Integer a = 10; // autoboxing

    public static void main(String[] args) {
        int a1 = a; // autounboxing
        m1(a1);
    }
    public static void m1(Integer i){  // autoboxing
        int k = i; // autounboxing
        System.out.println(k);
    }


}
