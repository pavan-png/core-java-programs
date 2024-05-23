class Flat{
    private int price = 15000000;
    void area(){
        String name_Of_The_Area = "polyclinic road";
        class Address{
            void flat_Address(){
                System.out.println("the flat is located in "+name_Of_The_Area);
            }
        }
        Address obj = new Address();
        obj.flat_Address();
    }
}
public class Local_Inner_Class_Local_Variabe {
    public static void main(String[] args) {
            Flat obj1 = new Flat();
            obj1.area();
    }
}
