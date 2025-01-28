public class AutoBoxing_UnBoxing_Eg15 {
    public static void go(Short s){
        System.out.println("Short");
    }
    public static void go(Integer i){
        System.out.println("int");
    }

    public static void go(Long l){
        System.out.println("Long");
    }
    public static void main(String[] args) {
        short x = 10;
        long y = 5;
        go(x);
        go(y);
        /*
        first compiler checks , whether a primitive available for implicit type casting , if not present
        it will check with available wrapper classes for implicit type casting . always same type is given first preference
         */

    }
}
