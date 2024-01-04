public class For_Loop_Eg15 {
    public static void main(String[] args) {
        label:
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (i == j)
                    continue label;
                System.out.println("i = " + i + "  j = " + j);
            }
        }


    }
}
