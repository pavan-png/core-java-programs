public enum Default_Syntax_Of_Constant_And_Constructor_Calling {
    MON,
    /*
    for every constant by default the below syntax is added
    public static final Constant_Itself_Variable_And_Value  MON = new Constant_Itself_Variable_And_Value();

     */

    TUE,
    WED,
    THU,
    FRI,
    SAT,
    SUN;

    Default_Syntax_Of_Constant_And_Constructor_Calling(){
        System.out.println("constructor is called");
    }

    public static void main(String[] args) {
        Constant_Itself_Variable_And_Value day =  Constant_Itself_Variable_And_Value.SUN;
        System.out.println(day);
    }
}
