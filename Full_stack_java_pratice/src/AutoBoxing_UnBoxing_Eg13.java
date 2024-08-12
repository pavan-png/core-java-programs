public class AutoBoxing_UnBoxing_Eg13 {
    public static void main(String[] args) {
        Boolean obj = new Boolean(true); // obj = true
        Integer x = 343;
        Integer y = new AutoBoxing_UnBoxing_Eg13 ().go(obj,x); // true , 343
        // object for class is created and go() is called with parameters and  auto boxing is done to store result 49 ( primitive) is stored in y.

        System.out.println(y);

    }
    int  go(Boolean b , int i ){
        if(b) return ( i/7); // return 343/7
        return (i/49);
    }
}
