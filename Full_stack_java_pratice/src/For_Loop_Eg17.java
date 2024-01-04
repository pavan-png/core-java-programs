public class For_Loop_Eg17 {
    public static void main(String[] args) {
        int i =0,j =5;
        for (;(i<3)&&(j++<10);){
            System.out.print(" " +i + " " + j);
            i++;
        }
        System.out.print(" "+i + " " + j);
    }
}
