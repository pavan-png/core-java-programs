class Test < T > {

}
public class Unbounded_Type_parameter_At_Class_level {
    public static void main(String[] args) {
        Test<Integer> t = new Test<Integer>();
        Test<String> s = new Test<String>();
    }
}
