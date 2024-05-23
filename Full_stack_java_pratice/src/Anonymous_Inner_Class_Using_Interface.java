interface Car{
    // here method is an abstract by  default
    void tata_Harrier();
}
public class Anonymous_Inner_Class_Using_Interface {
    public static void main(String[] args) {
        Car obj = new Car(){
            // here method must be declared as public otherwise it throws error.
           public void tata_Harrier(){
                System.out.println("tata harrier is the best suv");
            }
        };
        obj.tata_Harrier();
    }
}
