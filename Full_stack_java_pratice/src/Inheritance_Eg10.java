abstract class Acccess_modifiers{
    protected abstract double getSales();
    public double getCommision(){
        return   getSales()*0.15;
    }
}
public class Inheritance_Eg10 extends Acccess_modifiers {
    @Override
   /* protected double getSales() {
        return 1230.45;
    }
    */
    public double getSales(){
        return 1230.45;
    }

    public static void main(String[] args){
        Inheritance_Eg10 obj = new Inheritance_Eg10();
        obj.getSales();
    }
}
