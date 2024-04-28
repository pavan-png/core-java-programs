public class PrimitiveValue_Injection {
    public static void main(String[] args) {
        Student01 student01 = new Student01("pavan",24,123);
        System.out.println(student01);
        System.out.println("-----------------------------------------------------------");
        student01.setSt_Name("kalyan");
        System.out.println( student01.getSt_Name());
        student01.setSt_Age(24);
       System.out.println( student01.getSt_Age());
       student01.setSt_Id(456);
        System.out.println( student01.getSt_Id());
    }
}
