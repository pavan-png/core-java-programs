class Variable_Arguments{
    public void add(int... x){

      for(int a:x){
          System.out.println("variable arguments "+a);
      }



    }
}

public class Var_Args_Eg1 {
    public static void main(String[] args) {
        Variable_Arguments obj = new Variable_Arguments();
        obj.add(10);
        obj.add(10,14);
        obj.add(10,15,29);
        obj.add(13,34,23,12);
    }
}
