public class Switch_Case_Eg2 {
    public static void main(String[] args) {

        int x = 20;

        /*
         The below switch block is commented because it causes a COMPILE-TIME ERROR.

         Reason:
         -------
         A switch statement must contain at least one valid label:
         - case
         - or default

         In this code:
         -------------
         switch (x) {
             System.out.println("Hello");
         }

         There is no case or default label inside the switch block.

         Java syntax rule:
         -----------------
         The body of a switch statement must consist only of:
         - case labels
         - default label
         - statements under those labels

         A switch block cannot contain standalone statements directly.

         Hence, this switch statement is INVALID and will not compile.
        */
    }
}
