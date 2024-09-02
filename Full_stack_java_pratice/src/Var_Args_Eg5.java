class A4{
public String doIt(int a  , int b){
    return "a";
}
public String doIt(int... var){
    return "b";
}
}
public class Var_Args_Eg5 {
    public static void main(String[] args) {
        A4 obj = new A4();
        System.out.println(obj.doIt(4,5));

    }
}
