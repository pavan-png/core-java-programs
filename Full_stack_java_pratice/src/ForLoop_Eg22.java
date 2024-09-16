public class ForLoop_Eg22 {
    static String s = "";
    public static void main(String[] args) {
        z:for (int i = 2 ;i<7 ; i++){
        if (i==3)
            continue  ;
        if (i==5)
            break z;

        // inside static method static variables can be acessed
        s = s+i;
        // string plus integer is stored as a string
        }

         System.out.println(s);
        // inside static method static variables can be acessed
    }
}
