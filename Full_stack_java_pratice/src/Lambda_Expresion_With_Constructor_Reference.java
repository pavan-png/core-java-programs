class Sample_2{
    private String s;
    public Sample_2(String s){
        this.s = s;
        System.out.println("Constructor executed " +s);
    }
}

interface Test_13{
    public Sample_2 get(String s1);
}
public class Lambda_Expresion_With_Constructor_Reference {
    public static void main(String[] args) {
        Test_13 t = (String s2)->{
            return new Sample_2(s2);
        };

        // constructor reference , in get method we are giving the body and binding it with the constructor
        Test_13 t1 = Sample_2::new;
        t1.get("constructor reference");



    }
}
