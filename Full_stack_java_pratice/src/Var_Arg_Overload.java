class Variable_Argument_Overload{
    public void methodOne(int... x){
        System.out.println(" var arg method ");
    }
    public void methodOne(int x){
        System.out.println(" int arg method ");
    }

}
public class Var_Arg_Overload {
    public static void main(String[] args) {
        Variable_Argument_Overload obj = new Variable_Argument_Overload();
        obj.methodOne();
        obj.methodOne(10);
        obj.methodOne(10,20,30);

        /*
        if we have to pass the arguments to a method containing variable arguments then we can call method with
        no arguments also in main method.
        if there is a method without variable arguments then we must pass the compulsorily pass the arguments as per the
        parameters otherwise it leads to compile time error.
         */
    }
}
