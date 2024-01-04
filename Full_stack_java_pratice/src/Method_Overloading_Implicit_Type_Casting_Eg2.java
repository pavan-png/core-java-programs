public class Method_Overloading_Implicit_Type_Casting_Eg2 {
    float add (int a , float b){
        return a+b;
    }

    float add (float a , int b){
        return a+b;
    }
    public static void main(String[] args) {
        Method_Overloading_Implicit_Type_Casting_Eg2 obj = new Method_Overloading_Implicit_Type_Casting_Eg2();
        // compiler doesn't know to which method arguments should be passed.
        // obj.add(20,30);


    }
}
