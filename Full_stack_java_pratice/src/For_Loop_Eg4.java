public class For_Loop_Eg4 {
    public static void main(String[] args) {

        int i = 0;

        /*
         for-loop structure:
         -------------------
         for (initialization ; condition ; increment)

         IMPORTANT POINT:
         ----------------
         - Initialization and increment sections can contain
           ANY valid statements, not only variable updates.
        */
        for (System.out.println("hello"); i < 3; System.out.println("hi")) {

            /*
             FLOW OF EXECUTION:
             -----------------

             1) Initialization part executes FIRST and ONLY ONCE:
                System.out.println("hello");

             2) Condition is checked:
                i < 3

             3) If condition is TRUE:
                loop body executes.

             4) Inside loop body:
                i++ increments i.

             5) Increment section executes AFTER loop body:
                System.out.println("hi");

             6) Steps 2–5 repeat until condition becomes false.
            */
            i++;
        }
    }
}
