public class For_Loop_Eg12 {
    public static void main(String[] args) {
        label:for (int i =0;i<3;i++){
        for (int j = 0;j<3;j++){
            if (i==j)
                break; // breaks only the inner loop not the outer one
            System.out.println("i = "+i + "  j = " +j);
        }
        }



    }
}
