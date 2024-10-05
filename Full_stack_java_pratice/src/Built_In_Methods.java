

public enum Built_In_Methods {
    ROYAL_ENFIELD,
    HERO,
    TVS,
    HONDA,
    BAJAJ,
    KTM,
    HUSQAVARNA;

    public static void main(String[] args) {
        Built_In_Methods ref = Built_In_Methods.ROYAL_ENFIELD;
        System.out.println(ref);
       Built_In_Methods arr[] =  Built_In_Methods.values();
       for (Built_In_Methods s : arr){
           System.out.println(s.ordinal() +  "  :  " +s.name());
       }
    }
}
