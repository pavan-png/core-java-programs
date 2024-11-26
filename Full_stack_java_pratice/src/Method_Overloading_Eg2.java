public class Method_Overloading_Eg2 {
    int result;
    int add (int a, int b){
        return a+b;
    }

    void add(int a , byte b){
        result = a+b;
    }

    public static void main(String[] args) {
    Method_Overloading_Eg2 obj = new Method_Overloading_Eg2();
    obj.add(20,30);

    }
}
