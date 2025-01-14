public class AutoBoxing_UnBoxing_Eg4 {
    public static void main(String[] args) {
        Integer i1 = 10;
        Integer i2 = i1;
        i1++; // i1 = i1+1
        System.out.println(i1);
        System.out.println(i2);
        // since i1 is incremented after i1 is assigned to i2.

        System.out.println(i1==i2);
    }
}
