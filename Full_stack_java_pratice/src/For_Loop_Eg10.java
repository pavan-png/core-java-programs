public class For_Loop_Eg10 {
    public static void main(String[] args) {

        /*
         for-loop runs with i starting from 0.
         Condition: i < 10
        */
        for (int i = 0; i < 10; i++) {

            /*
             When i becomes 5,
             the break statement executes.

             `break` immediately terminates the loop,
             not just the if block.
            */
            if (i == 5)
                break;

            /*
             This line executes only
             while i is less than 5.
            */
            System.out.println(i);
        }
    }
}
