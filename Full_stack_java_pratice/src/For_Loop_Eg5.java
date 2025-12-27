public class For_Loop_Eg5 {
    public static void main(String[] args) {

        /*
         for-loop structure:
         -------------------
         for (initialization ; condition ; increment)

         In this loop:
         - initialization is missing
         - condition is missing
         - increment is missing

         Java rule:
         ----------
         If the condition part is omitted,
         it is treated as ALWAYS TRUE.

         Hence, this loop becomes an INFINITE LOOP.
        */
        for (;;) {
            System.out.println("hello");
        }
    }
}
