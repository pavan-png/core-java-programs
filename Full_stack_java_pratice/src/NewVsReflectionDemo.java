class Demo_1 {

    // Static variable
    static int staticVar = 10;

    // Static block (runs only once when class is loaded)
    static {
        System.out.println("1️⃣ Static block executed (Class Loaded)");
    }

    // Instance variable
    int x = 5;

    // Instance block (runs every time before constructor)
    {
        System.out.println("3️⃣ Instance block executed");
    }

    // No-argument constructor
    public Demo_1() {
        System.out.println("4️⃣ Constructor executed");
    }
}

public class NewVsReflectionDemo {

    public static void main(String[] args) throws Exception {

        System.out.println("===== Using new Keyword =====");

        // 2️⃣ When we use 'new', class must be known at compile time
        // If class not found -> compile-time error
        Demo_1 d1 = new Demo_1();

        System.out.println("Class Name: " + d1.getClass().getName());

        System.out.println("\n===== Using Reflection (Dynamic Loading) =====");

        // Class name is given at runtime (dynamic loading)
        // If class not found -> ClassNotFoundException (runtime)
        Class<?> clazz = Class.forName("Demo_1");

        // Modern way (recommended)
        // Calls no-argument constructor
        Object obj = clazz.getDeclaredConstructor().newInstance();

        System.out.println("Class Name: " + obj.getClass().getName());
    }
}