class House_1{
    private int cost = 30000000;
    void area(){
        class House_Cost{
            void cost(){
                System.out.println("cost of house is " +cost);
            }
        }
        // object of local class should be created inside the method of outer class and outside of local class
        House_Cost obj = new House_Cost();
        obj.cost();

    }
}
public class Local_Inner_Class_Instance_Variable {
    public static void main(String[] args) {
     // here outer class object is created and with that object outer class  method is  called .
        House_1 obj1 = new House_1();
     obj1.area();
    }
}
