public class Exception_Print_Methods_Demo {

    public static void main(String[] args) {

        try {
            int a = 10;
            int b = 0;

            // Risky code (ArithmeticException will occur)
            int result = a / b;

            System.out.println("Result: " + result);

        } catch (ArithmeticException e) {

            // 1️⃣ getMessage()
            // Prints only the description of the exception
            System.out.println("Using getMessage():");
            System.out.println(e.getMessage());
            // Output: / by zero


            System.out.println("---------------------------");

            // 2️⃣ toString()
            // Prints exception class name + description
            System.out.println("Using toString():");
            System.out.println(e.toString());
            // Output: java.lang.ArithmeticException: / by zero


            System.out.println("---------------------------");

            // 3️⃣ printStackTrace()
            // Prints full exception details including line number
            System.out.println("Using printStackTrace():");
            e.printStackTrace();
            /*
              Output Example:
              java.lang.ArithmeticException: / by zero
                  at Exception_Print_Methods_Demo.main(Exception_Print_Methods_Demo.java:11)
            */
        }
    }
}