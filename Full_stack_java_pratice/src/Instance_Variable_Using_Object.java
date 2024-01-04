public class Instance_Variable_Using_Object {
    String name;
    int car_Number;
    void car(){
        System.out.println("the car number is  " + car_Number);
    }

    public static void main(String[] args) {
        Instance_Variable_Using_Object obj = new Instance_Variable_Using_Object();
    obj.car_Number = 12345;
    obj.car();
    }
}
