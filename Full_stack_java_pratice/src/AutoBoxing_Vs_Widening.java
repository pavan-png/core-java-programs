// Demonstrates overload resolution preference: primitive widening is chosen over autoboxing.
public class AutoBoxing_Vs_Widening {
    // Overload that accepts a wider primitive type.
    public static void m1(long l ){
        System.out.println("widening");
    }

    // Overload that accepts the boxed wrapper type.
    public static void m1(Integer i){
        System.out.println("AutoBoxing");
    }
    public static void main(String[] args) {
        // int literal assigned to primitive int.
        int x = 10; // compiler will do implicit type casting.
        // x is int (primitive) =======> widening conversion =======> long.
        m1(x);
        /*
          In overload resolution, the compiler prefers primitive widening
          over boxing when both are applicable.
          Therefore, m1(long l) is called .
        */
    }
}
