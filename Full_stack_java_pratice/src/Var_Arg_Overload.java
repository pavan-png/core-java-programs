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
    }
}
