class Sample_1{
    private String s;
    Sample_1(String s){
        this.s = s;
        System.out.println("constructor executed ..."+s);
    }

}

interface Test_11{
    public Sample_1 get(String s1);
}
public class Lambda_Expresion_With_Constructor {
    public static void main(String[] args) {
        Test_11 t = (String s2)->{
            return new Sample_1(s2);
        };
        t.get("calling from lambda expression");

    }
}
