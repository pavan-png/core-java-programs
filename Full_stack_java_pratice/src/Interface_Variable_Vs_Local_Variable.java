interface ILocal{
    int a = 10;
}
public class Interface_Variable_Vs_Local_Variable  implements ILocal{
    public static void main(String[] args) {
        // local variable , if a is re-assigned like this a = 20 then it would be an error.
        int a = 20;

        // between local variable and Static final variable with same name , the priority is always for local variable.
        System.out.println(a);

        // to access the interface variable
        System.out.println(ILocal.a);
    }
}
