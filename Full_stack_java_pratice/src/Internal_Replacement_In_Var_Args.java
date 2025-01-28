class Var_Args_replace{
    int total;
    public void m1(int... x){
        /*
        we can declare int[] single dimensional array in place of variable arguments ( internally it is replaced
        by int[] )
        but at the time of passing arguments we should pass the arguments with new keyword as below method m2()
        otherwise compile time error.
         */
        for (int i:x){
            total = i + total;
        }
        System.out.println("the total is "+ total);
    }

    public void m2(int[] y){

    }
}
public class Internal_Replacement_In_Var_Args {
    public static void main(String[] args) {
        Var_Args_replace obj = new Var_Args_replace();
        obj.m1(10,20,30,40);
        obj.m1(new int[]{1,1,1,14});
        obj.m2(new int[]{2,3,4,5});
        // obj.m2(1,2,3) compile time error.
    }
}
