abstract class Bike{
    abstract void royal_Enfield();
}
public class Anonymous_Inner_Class {
    public static void main(String[] args) {
        Bike obj = new Bike(){
            void royal_Enfield(){
                System.out.println("classic 350 is  the best retro cruiser bike ");
            }
        };
        obj.royal_Enfield();
    }
}
