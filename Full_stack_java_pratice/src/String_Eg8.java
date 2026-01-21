public class String_Eg8 {
    public static void main(String[] args) {

        // Creates a NEW String object in HEAP
        // "pavan " literal is stored in String Constant Pool (SCP)
        String s1 = new String("pavan ");

        // concat() creates a NEW String object "pavan kalyan" in HEAP
        // Since the result is NOT assigned to any reference,
        // this object becomes eligible for Garbage Collection
        s1.concat("kalyan");

        // += internally works like: s1 = s1 + "millionaire "
        // A new String object "pavan millionaire " is created in HEAP
        // s1 reference is updated to point to this NEW object
        s1 += "millionaire ";

        // concat() creates another NEW String object "pavan millionaire billionaire" in HEAP
        // s2 now references this new object
        String s2 = s1.concat("billionaire");

        // Prints the value currently referenced by s1
        // Output: pavan millionaire
        System.out.println(s1);

        // Prints the value currently referenced by s2
        // Output: pavan millionaire billionaire
        System.out.println(s2);
    }
}
