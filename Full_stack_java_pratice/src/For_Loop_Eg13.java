public class For_Loop_Eg13 {
    public static void main(String[] args) {
        label:
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (i == j)
                    break label; // breaks the outer loop so no output
                System.out.println("i = " + i + "  j = " + j);
            }
        }


    }
    }
