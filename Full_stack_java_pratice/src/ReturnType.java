public class ReturnType {
    public int getValue(){
        int value = 0;
        boolean setting  = true;
        String title = "Hello";
       //   value is of type int but boolean is expected so compile time error
         /*  if(value || (setting && title=="Hello")){
            return 1;

             }
         */
        if (value == 1 & title.equals("Hello")){
            return 2;
            /* if block doesn't return anything. when if is used in method with return type ,we can return from if block.
            return should be the last statement in the method.
            there can only be one return statement in method. but inside method we can any no of blocks with return statements.
            but only the return which is the last line of method is considered.
             */
        }
        return value;

    }

    public static void main(String[] args) {
        ReturnType obj = new ReturnType();
        System.out.println(obj.getValue());


    }


}
