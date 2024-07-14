class Variable_Arguments_Eg2{
    int total =0;
   public void add(int...x){
       for(int i =0; i<x.length;i++){
            total += x[i];
        }
        System.out.println("the sum is  total  "+total);
    }
}
public class Var_Args_Eg2 {
    public static void main(String[] args) {
        Variable_Arguments_Eg2 obj = new Variable_Arguments_Eg2();
        obj.add();
        obj.add(10);

        // here operation is performed on same object , so  previous data is  included
        obj.add(10,20);
    }
}
