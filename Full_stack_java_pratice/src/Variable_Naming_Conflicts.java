// Interface 1
interface ITop {

    // By default: public static final
    int a = 8888;
}

// Interface 2
interface IBottom {

    // By default: public static final
    int a = 9999;
}

// Implementation class
public class Variable_Naming_Conflicts implements ITop, IBottom {

    public static void main(String[] args) {

        // ❌ 1. Direct access - Compile-time Error
        // System.out.println(a);
        // Error: reference to 'a' is ambiguous
        // Because compiler finds 'a' in both ITop and IBottom


        // ❌ 2. Access using object - ALSO Compile-time Error
        Variable_Naming_Conflicts obj = new Variable_Naming_Conflicts();

        // System.out.println(obj.a);
        // Error: reference to 'a' is ambiguous
        // Because object implements both interfaces
        // Compiler still doesn't know whether it is ITop.a or IBottom.a


        // ✅ 3. Correct Way - Use Interface Name
        System.out.println("Value from ITop: " + ITop.a);
        System.out.println("Value from IBottom: " + IBottom.a);


        // ❌ 4. Cannot modify (because final)
        // ITop.a = 100;   // Compile-time error: cannot assign a value to final variable
    }
}
