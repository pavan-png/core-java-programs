public class This_As_Argument_In_Method {

    //   datatype var_name
    void display1(This_As_Argument_In_Method s1 ){

        System.out.println("method involked");
    }
    void display2(){

        display1(this);
    }

    public static void main(String[] args) {
        This_As_Argument_In_Method obj1 = new This_As_Argument_In_Method();
        obj1.display2();
    }
}
