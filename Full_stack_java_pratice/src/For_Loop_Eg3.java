public class For_Loop_Eg3 {
    public static void main(String[] args) {

        int i = 0;

        /*
         for-loop structure:
         -------------------
         for (initialization ; condition ; increment)

         IMPORTANT:
         ----------
         The initialization part can contain ANY valid statement,
         not only variable initialization.
        */
        for (System.out.println("hello you are sleeping"); i < 3; i++) {

            /*
             Flow explanation:
             -----------------
             1) Initialization part executes FIRST and ONLY ONCE:
                System.out.println("hello you are sleeping");

             2) Then condition is checked:
                i < 3

             3) If condition is true:
                loop body executes.

             4) After loop body:
                increment part (i++) executes.

             5) Steps 2–4 repeat until condition becomes false.
            */
            System.out.println("no boss you are sleeping");
        }
    }
}
