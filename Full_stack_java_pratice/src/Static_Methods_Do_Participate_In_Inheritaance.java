class Parent_999{
    public static void display(){
        System.out.println("hello parent");
    }
}
class Child_999 extends  Parent_999{

}
public class Static_Methods_Do_Participate_In_Inheritaance {
    public static void main(String[] args) {
        Parent_999 obj = new Child_999();
        obj.display();
        Parent_999.display();
        // display() can be called in both the above mentioned ways.

    }
}
