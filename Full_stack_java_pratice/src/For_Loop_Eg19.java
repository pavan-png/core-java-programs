public class For_Loop_Eg19 {
    public static void main(String[] args) {
        int i;
        for (i=0;i<6;i++){
            if (++i>3)
                continue;
        }
        System.out.println(++i);
    }
}
