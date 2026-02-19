// Interface declaration
// All variables inside interface are automatically:
// public static final (even if not written)
interface ILocal {

    int a = 10;   // public static final int a = 10;
    // This is a constant stored in Method Area.
    // Only one copy exists.

    int b = 39;   // public static final int b = 39;
    // Another interface constant.
}


// Main class implementing the interface
// "implements" gives access to interface constants and abstract methods
public class Interface_Variable_Vs_Local_Variable  implements ILocal {

    public static void main(String[] args) {

        // Local variable declared inside main method
        // Stored in stack memory (inside main() stack frame)
        int a = 20;

        // Prints local variable value
        // Local variable has highest priority during name resolution
        // This hides (shadows) interface variable 'a'
        System.out.println(a);         // Output: 20

        // Accessing interface variable explicitly using interface name
        // Since interface variables are static, they should ideally
        // be accessed using InterfaceName.variableName
        System.out.println(ILocal.a);  // Output: 10

        // No local variable named 'b' exists
        // So Java looks for class/static/interface level variable
        // Since class implements ILocal, it can access 'b' directly
        System.out.println(b);         // Output: 39

        // Best practice version:
        // System.out.println(ILocal.b);
    }
}
