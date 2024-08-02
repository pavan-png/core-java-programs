public class AutoBoxing_UnBoxing_Eg9 {
    Integer i ;
    int x;
    public AutoBoxing_UnBoxing_Eg9(int y){
        x = i+y;

        /*  auto unboxing will happen at r.h.s side and result is stored in x
         int(x) = Integer (i) + int (y)
                    = null  + 4           since i is reference type no value is assigned to it so null.
                    = cant perform operation on null ( adding null and 4 )  leads to null pointer exception


         */
        System.out.println(x);


    }
    public static void main(String[] args) {
    new AutoBoxing_UnBoxing_Eg9(new Integer(4));


    }
}
