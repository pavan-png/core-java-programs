 class S_Inherit_Eg {
    void car(){
        System.out.println("this is volvo xc 90 ");
    }
}
class  S_Inherit_Eg1 extends S_Inherit_Eg{
    void bussiness_class_car(){
        System.out.println(" this is range rover sv lwb top end variant");
    }
}
public class Single_Level_Inheritance{
    public static void main(String[] args) {
        S_Inherit_Eg1 obj = new S_Inherit_Eg1();
        obj.car();
        obj.bussiness_class_car();
    }
}
