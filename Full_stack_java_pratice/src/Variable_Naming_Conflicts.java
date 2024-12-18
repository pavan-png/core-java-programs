interface ITop{
    int a = 8888;
}
interface IBottom{
    int a = 9999;
}


public class Variable_Naming_Conflicts implements  ITop , IBottom {

    public static void main(String[] args) {
    //     System.out.println(a);  compile time error
        System.out.println(ITop.a); // variables are public static final by default
        System.out.println(IBottom.a);
    }
}
