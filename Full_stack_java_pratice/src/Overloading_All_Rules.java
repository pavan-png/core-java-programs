class Overloading_All_Rules {

    // -------------------------------------------------
    // Rule 1 & Rule 2: Same method name, different parameters
    // -------------------------------------------------
    void add(int a, int b) {
        System.out.println("add(int, int)");
    }

    void add(int a, int b, int c) {
        System.out.println("add(int, int, int)");
    }

    // -------------------------------------------------
    // Rule 2: Parameter TYPE changed
    // -------------------------------------------------
    void add(double a, double b) {
        System.out.println("add(double, double)");
    }

    // -------------------------------------------------
    // Rule 2: Parameter ORDER changed
    // -------------------------------------------------
    void add(int a, double b) {
        System.out.println("add(int, double)");
    }

    // -------------------------------------------------
    // Rule 3: Return type NOT considered
    // (This is why changing only return type is illegal)
    // int add(int a, int b) {}
    // double add(int a, int b) {}  ❌ compile-time error
    // -------------------------------------------------

    // -------------------------------------------------
    // Rule 4: Access modifier does NOT matter
    // -------------------------------------------------
    public void show(int a) {
        System.out.println("public show(int)");
    }

    private void show(int a, int b) {
        System.out.println("private show(int, int)");
    }

    // -------------------------------------------------
    // Rule 8: static methods CAN be overloaded
    // -------------------------------------------------
    static void test(int a) {
        System.out.println("static test(int)");
    }

    static void test(int a, int b) {
        System.out.println("static test(int, int)");
    }

    // -------------------------------------------------
    // Rule 9: final methods CAN be overloaded
    // -------------------------------------------------
    final void display(int a) {
        System.out.println("final display(int)");
    }

    final void display(int a, int b) {
        System.out.println("final display(int, int)");
    }

    // -------------------------------------------------
    // Rule 10: private methods CAN be overloaded
    // -------------------------------------------------
    private void log(String s) {
        System.out.println("log(String)");
    }

    private void log(int a) {
        System.out.println("log(int)");
    }

    // -------------------------------------------------
    // Rule 12: Autoboxing, widening, varargs
    // -------------------------------------------------
    void process(int a) {
        System.out.println("process(int)");
    }

    void process(long a) {
        System.out.println("process(long)");
    }

    void process(Integer a) {
        System.out.println("process(Integer)");
    }

    void process(int... a) {
        System.out.println("process(varargs)");
    }

    // -------------------------------------------------
    // MAIN METHOD — shows compile-time resolution
    // -------------------------------------------------
    public static void main(String[] args) {

        Overloading_All_Rules obj = new Overloading_All_Rules();

        // Rule 5: Compile-time resolution
        obj.add(10, 20);          // exact match → add(int, int)
        obj.add(10, 20, 30);      // add(int, int, int)
        obj.add(10.5, 20.5);      // add(double, double)
        obj.add(10, 20.5);        // add(int, double)

        obj.show(5);              // public show(int)
        obj.show(5, 6);           // private show(int, int)

        test(10);                 // static test(int)
        test(10, 20);             // static test(int, int)

        obj.display(7);           // final display(int)
        obj.display(7, 8);        // final display(int, int)

        obj.log("hello");         // log(String)
        obj.log(100);             // log(int)

        // Rule 12: Overloading priority
        obj.process(10);          // exact match → process(int)
        obj.process(10L);         // widening → process(long)
        obj.process(Integer.valueOf(10)); // autoboxing → process(Integer)
        obj.process(1, 2, 3);     // varargs → process(int...)
    }
}
