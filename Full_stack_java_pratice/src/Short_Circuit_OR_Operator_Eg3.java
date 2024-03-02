public class Short_Circuit_OR_Operator_Eg3 {
    public static void main(String[] args) {
        int a = 3;
        System.out.println(a++==3 || --a==3 && --a==3 );
        System.out.println(a);
    }
}
