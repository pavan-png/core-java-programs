public class Exceptional_Handling_Eg13 {

    static String s = "-";
    // Step 1: Static variable initialized → s = "-"

    public static void main(String[] args) {

        try {
            // Step 2: Outer try starts
            throw new Exception();
            // Step 3: Exception thrown immediately
            // Control jumps to outer catch block
        }
        catch (Exception e) {

            // Step 4: Outer catch block executes

            try {
                // Step 5: Middle try starts

                try {
                    // Step 6: Inner try starts
                    throw new Exception();
                    // Step 7: Exception thrown
                    // Control goes to inner catch
                }
                catch (Exception ex) {
                    // Step 8: Inner catch executes
                    s += "ic ";   // s = "-ic "
                }

                // Step 9: After inner catch completes,
                // execution continues normally here

                throw new Exception();
                // Step 10: New exception thrown
                // Control moves to middle catch

            }
            catch (Exception x) {
                // Step 11: Middle catch executes
                s += "mc ";   // s = "-ic mc "
            }
            finally {
                // Step 12: Middle finally ALWAYS executes
                s += "mf ";   // s = "-ic mc mf "
            }
        }
        finally {
            // Step 13: Outer finally ALWAYS executes
            s += "of ";   // s = "-ic mc mf of "
        }

        // Step 14: Print final value
        System.out.println(s);
    }
}