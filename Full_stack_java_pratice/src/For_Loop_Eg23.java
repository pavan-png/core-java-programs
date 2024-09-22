
public class For_Loop_Eg23 {
    public static void main(String[] args) {
        foreach: // labeled for loop name can be anything
        for (int j = 0; j < 5; j++) {
            for (int k = 0; k < 3; k++) {
                System.out.print("" + j);
                if (j == 3 && k == 1)
                    break foreach; // breaks outer loop
                if (j == 0 || j == 2)
                    break;

            }

        }

    }
}
