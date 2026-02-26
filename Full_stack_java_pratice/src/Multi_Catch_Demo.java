public class Multi_Catch_Demo {

    public static void main(String[] args) {

        try {
            int[] arr = new int[3];
            arr[5] = 100;   // ArrayIndexOutOfBoundsException

            int result = 10 / 0;   // ArithmeticException
        }

        // Instead of writing multiple separate catch blocks
        // like catch(ArithmeticException e) and catch(ArrayIndexOutOfBoundsException e),
        // we can write multiple exceptions in a single catch block using the "|" symbol.
        catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
            System.out.println("An exception occurred.");
            System.out.println("Exception type: " + e.getClass().getSimpleName());
        }

        System.out.println("Program continues normally...");
    }
}