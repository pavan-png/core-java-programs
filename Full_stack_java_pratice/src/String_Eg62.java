public class String_Eg62 {
    public static void main(String[] args) {

        // new String() creates a NEW object in Heap memory
        // Content is "pAvan"
        String s1 = new String("pAvan");

        // Another NEW String object in Heap
        // Content is "paVan"
        String s2 = new String("paVan");

        // IMPORTANT:
        // This is ASSIGNMENT (=), NOT comparison
        // RHS (s2) is evaluated first
        // The reference of s2 is assigned to s1
        //
        // After assignment:
        // s1 and s2 both point to the SAME Heap object ("paVan")
        //
        // println prints the VALUE of the assignment expression
        System.out.println(s1 = s2);

        // The original object "pAvan" is no longer referenced by s1
        // It becomes eligible for Garbage Collection
    }
}
