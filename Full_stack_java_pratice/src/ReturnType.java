public class ReturnType {
    public int getValue(){
        int value = 0;
        boolean setting  = true;
        String title = "Hello";
       /*   value is of type int but since short circuit operator is used it should be boolean so C.E
           if(value || (setting && title=="Hello")){
            return 1;
        }  */
        if (value == 1 & title.equals("Hello")){
            return 2;
        }
        return value;
    }

    public static void main(String[] args) {
        ReturnType obj = new ReturnType();
        obj.getValue();
    }
}
