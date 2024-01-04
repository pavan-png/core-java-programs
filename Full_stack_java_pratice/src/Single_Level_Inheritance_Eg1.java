class S_Inherit_Eg2{
    void iphone (){
        System.out.println("iphone has excellent camera and processor");
    }
}
public class Single_Level_Inheritance_Eg1 extends S_Inherit_Eg2{
    void android(){
        System.out.println("samsung and pixel are excellent in camera and performance");
    }
    public static void main(String[] args) {
        Single_Level_Inheritance_Eg1 obj = new Single_Level_Inheritance_Eg1();
        obj.iphone();
        obj.android();
    }
}
