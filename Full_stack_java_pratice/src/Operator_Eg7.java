public class Operator_Eg7 {
    public static void main(String[] args) {

        Long tail = 2000L;
        Long distance = 1999L;
        Long story = 1000L;

        /*
         IF–1 CONDITION:
         ----------------
         (tail > distance) ^ (story * 2) == tail

         Step-by-step evaluation:

         1) (tail > distance)
            - tail = 2000
            - distance = 1999
            - 2000 > 1999 → true

            NOTE:
            Long objects are AUTO-UNBOXED to primitive long
            before comparison.

         2) (story * 2)
            - story = 1000
            - 1000 * 2 → 2000

         3) (story * 2) == tail
            - 2000 == 2000 → true

         4) XOR ( ^ ) evaluation:
            true ^ true → false

         Since condition is false,
         this if block does NOT execute.
        */
        if ((tail > distance) ^ (story * 2) == tail)
            System.out.println("1");

        /*
         IF–2 CONDITION:
         ----------------
         (distance + 1 != tail) ^ (story * 2) == distance

         Step-by-step evaluation:

         1) (distance + 1 != tail)
            - distance = 1999
            - 1999 + 1 → 2000
            - 2000 != 2000 → false

         2) (story * 2)
            - 1000 * 2 → 2000

         3) (story * 2) == distance
            - 2000 == 1999 → false

         4) XOR ( ^ ) evaluation:
            false ^ false → false

         Since condition is false,
         this if block does NOT execute.
        */
        if ((distance + 1 != tail) ^ (story * 2) == distance)
            System.out.println("2");
    }
}
