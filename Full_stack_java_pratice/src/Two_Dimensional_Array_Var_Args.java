public class Two_Dimensional_Array_Var_Args {

    void m1(int[]... x){  // 2d array
        System.out.println(x);
        for (int[] a:x) {
            System.out.println(a);
            for (int c : a) {
                System.out.println(c);
            }
        }
    }
    public static void main(String[] args) {
        Two_Dimensional_Array_Var_Args obj = new Two_Dimensional_Array_Var_Args();
        int[] d = {10,20,30};
        int[] e = {30,40};
        obj.m1(d,e);
    }
}
