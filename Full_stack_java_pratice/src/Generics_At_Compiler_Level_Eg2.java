import java.util.ArrayList;

public class Generics_At_Compiler_Level_Eg2 {
    public void m1(ArrayList<String> al){

    }
    /*
    public  void m1(ArrayList<Integer> al1){

     }

     C.E duplicates methods found
     same method  name but different arguments refers to method overloading
     in method overloading compiler will not check for the ref variable names it will check for the data types

        steps performed b by the compiler
        1. Compiler will scan the code
        2. Check the argument type
        3. if Generics found in the argument type remove the Generics syntax
        4. Compiler will again check the syntax

        here since generics are removed by the compiler it , the method and arguments both are same , which
        leads to  compile time error.

     */

    public static void main(String[] args) {

    }
}
