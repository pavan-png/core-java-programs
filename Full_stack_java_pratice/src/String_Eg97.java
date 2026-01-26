public class String_Eg97 {
    public static void main(String[] args) {

        /*
         * StringBuilder has multiple constructors:
         * 1) StringBuilder()
         * 2) StringBuilder(int capacity)
         * 3) StringBuilder(String str)
         *
         * When we pass null, the compiler tries to match:
         * StringBuilder(String str)
         *
         * At runtime, it throws NullPointerException
         * because StringBuilder does NOT accept null String.
         */
        StringBuilder sb = new StringBuilder(null); // Runtime Exception

        /*
         * The below line is commented because it will NOT even reach here.
         * Program fails at the constructor itself.
         */
        // System.out.println(sb.append(null));
    }
}
