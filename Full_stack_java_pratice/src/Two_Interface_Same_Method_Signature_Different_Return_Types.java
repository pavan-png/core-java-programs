interface IRight {
    int m1();
}

interface ILeft {
    String m1();
}

/*
class StraightImpl implements IRight, ILeft {

    // Compiler Error:
    // Return type conflict
    // Cannot implement both because method signature is same,
    // but return types are different.

}
*/

public class Two_Interface_Same_Method_Signature_Different_Return_Types {

    public static void main(String[] args) {

    }
}
