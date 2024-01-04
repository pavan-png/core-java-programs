class M_Level_Inherit{
    String bike = "TRIUMPH SCRAMBLER 250" ;
    void cruiser_bike(){
        System.out.println(bike +" is the best cruiser");
    }
}
class M_Level_Inherit1 extends M_Level_Inherit{
    void bike1(){
        System.out.println("duke 200 is best bike if tc , assist & slipper clutch , lauch control,cornering abs is included");

        // you can use instance variables directly into the inherited class  as below.
        System.out.println(bike + " comes with all the above features of duke 200");
    }
}
public class Multilevel_Inheritance_Eg1 {
    public static void main(String[] args) {
        M_Level_Inherit1 obj = new M_Level_Inherit1();
        obj.bike1();
        obj.cruiser_bike();
    }
}
