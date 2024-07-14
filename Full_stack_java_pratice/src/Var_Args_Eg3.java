class Variable_Arguments_Eg3{
    int total ;
    void add(int... a){
        for (int data : a){
            total = data+total;
        }
        System.out.println("the total is "+total);
    }

}

public class Var_Args_Eg3 {
    public static void main(String[] args) {
        Variable_Arguments_Eg3 obj = new Variable_Arguments_Eg3();
        obj.add();
        obj.add(10);
        obj.add(10,20,30);
    }
}
