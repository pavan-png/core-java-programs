public class One_Dimensional_Array_Var_Args {
public  void m1(int... c){
    for (int b : c){
        System.out.println(b);
    }
}
    public static void main(String[] args) {
            One_Dimensional_Array_Var_Args obj = new One_Dimensional_Array_Var_Args();
            obj.m1(10,20,30);
    }
}
