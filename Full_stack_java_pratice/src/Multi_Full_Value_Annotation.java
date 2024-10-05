@interface Multi_Value{
    String house() default "duplex house";
    String complex() default "shopping complex with imax";

}

@interface Full_Anoo{
    String private_Jet();
    String owned_Brand();
}

@Full_Anoo(private_Jet = "Lockheed Martin" , owned_Brand = "volkswagen")
public class Multi_Full_Value_Annotation {

}
