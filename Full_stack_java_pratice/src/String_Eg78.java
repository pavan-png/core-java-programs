// A user-defined class
class Special_String {

    String str;

    // Constructor to initialize the string
    Special_String(String str) {
        this.str = str;
    }

    // NOTE:
    // toString() is NOT overridden here
    // So Object class's toString() will be used
}

public class String_Eg78 {
    public static void main(String[] args) {

        // Object array can hold ANY type of object
        Object[] arr = new Object[4];

        // Filling array indices 1, 2, 3
        // (index 0 remains null)
        for (int i = 1; i <= 3; i++) {
            switch (i) {

                case 1:
                    // String object
                    // String overrides toString()
                    arr[i] = new String("java");
                    break;

                case 2:
                    // StringBuilder object
                    // StringBuilder also overrides toString()
                    arr[i] = new StringBuilder("java");
                    break;

                case 3:
                    // Custom class object
                    // Does NOT override toString()
                    arr[i] = new Special_String("java");
                    break;
            }
        }

        // Enhanced for loop to print each object
        for (Object obj : arr) {

            // System.out.println(obj) internally calls obj.toString()
            // If obj is null → prints "null"
            // If obj overrides toString() → prints meaningful content
            // If obj does NOT override toString() → prints className@hashCode
            System.out.println(obj);
        }
    }
}
