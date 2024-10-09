class Test_Eg11{
    public <T> void m1(T t){

    }
}
public class Generic_Method_With_Return_Type_Eg2 {
    public static void main(String[] args) {
        Test_Eg11 obj = new Test_Eg11();
        obj.m1(45);
        // we can any type of object , as we have not mentioned any particular type in the method m1() type parameter
    }
}
