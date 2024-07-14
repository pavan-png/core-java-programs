class Var_Args_replace{
    int total;
    public void m1(int... x){
        for (int i:x){
            total = i + total;
        }
        System.out.println("the total is "+ total);
    }
}
public class Internal_Replacement_In_Var_Args {
    public static void main(String[] args) {
        Var_Args_replace obj = new Var_Args_replace();
        obj.m1(10,20,30,40);
        obj.m1(new int[]{1,1,1,14});
    }
}
