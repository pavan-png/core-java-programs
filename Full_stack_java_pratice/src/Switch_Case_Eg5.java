public class Switch_Case_Eg5 {
    public static void main(String[] args) {
        int x =10;

        //no error in switch since switch conditional expression (or) label is of int data type only
        switch (x+1){

            /* here also no error since  label values is also of same type .
               since no break all the case statements are executed */
            case 10 :
            case 20+10:
            case 10+20+30:
        }
    }
}
