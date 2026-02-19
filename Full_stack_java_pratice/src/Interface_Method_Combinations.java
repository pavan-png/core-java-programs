public class Interface_Method_Combinations {

    // =========================================================
    // ❌ CASE 1
    // Same Method Name + Same Parameters + Different Return Types
    // =========================================================

    interface X1 {
        int geek();
    }

    interface Y1 {
        String geek();
    }

    /*
     * This will NOT compile.
     * Because both interfaces define:
     *
     * geek()
     *
     * Same method name
     * Same parameter list
     * Different return type
     *
     * Return type is NOT part of method signature.
     *
     * So compiler cannot decide which one to implement.
     */

    /*
    class Test1 implements X1, Y1 {

        // Try returning int → Y1 fails
        public int geek() { return 10; }

        // Try returning String → X1 fails
        // public String geek() { return "hello"; }
    }
    */


    // =========================================================
    // ✅ CASE 2
    // Same Method Name + Same Parameters + Same Return Type
    // =========================================================

    interface X2 {
        int geek();
    }

    interface Y2 {
        int geek();
    }

    static class Test2 implements X2, Y2 {

        /*
         * One implementation satisfies both interfaces.
         */

        @Override
        public int geek() {
            return 100;
        }
    }


    // =========================================================
    // ✅ CASE 3
    // Same Method Name + Different Parameters
    // =========================================================

    interface X3 {
        int geek();
    }

    interface Y3 {
        String geek(int x);
    }

    static class Test3 implements X3, Y3 {

        /*
         * Method signatures are different:
         * geek()
         * geek(int)
         *
         * This is method overloading.
         */

        @Override
        public int geek() {
            return 5;
        }

        @Override
        public String geek(int x) {
            return "Value: " + x;
        }
    }


    // =========================================================
    // ✅ CASE 4
    // Same Method Name + Different Parameters + Same Return Type
    // =========================================================

    interface X4 {
        void geek();
    }

    interface Y4 {
        void geek(int x);
    }

    static class Test4 implements X4, Y4 {

        @Override
        public void geek() {
            System.out.println("No argument version");
        }

        @Override
        public void geek(int x) {
            System.out.println("Argument version: " + x);
        }
    }


    // =========================================================
    // MAIN METHOD TO TEST VALID CASES
    // =========================================================

    public static void main(String[] args) {

        System.out.println("===== CASE 2 =====");
        Test2 t2 = new Test2();
        System.out.println(t2.geek());

        System.out.println("===== CASE 3 =====");
        Test3 t3 = new Test3();
        System.out.println(t3.geek());
        System.out.println(t3.geek(10));

        System.out.println("===== CASE 4 =====");
        Test4 t4 = new Test4();
        t4.geek();
        t4.geek(50);
    }
}
