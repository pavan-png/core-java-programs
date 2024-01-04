public class For_Loop_Eg20 {
    public static void main(String[] args) {
        int a = 0 ;
        int b = 7;
        // for (a ;a<b-1;a =a+2 )
        //  even though a  is already intialized we cannot use in for loop without intializing  again , it will lead to compile time error
        for (a = 0 ;a<b-1;a =a+2 ){
            System.out.println(a+ " ");
        }
    }
}
