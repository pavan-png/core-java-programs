class Royal_Enfield{
    void model(){
        System.out.println(" royal enfield only produces premium segment bikes ");
    }

    void sales(){

        System.out.println(" 1. classic 350  2. bullet 350 ");
    }
}
class Classic350 extends Royal_Enfield{
    void model(){
        System.out.println(" classic 350 is the best  reto - style cruiser in the segment , and has huge fan base");
    }
    void maintainence(){
        System.out.println(" classic 350 maintainence is also low when compared to others bike in the segment");
    }
}
class gt650 extends Royal_Enfield{
    void model(){
        System.out.println("gt 650 is the best cafe-racer in the segment ,and  has the huge fan base   ");
    }
    void maintainence(){
        System.out.println(" gt 650 maintainence is also low when compared to others bike in the segment");
    }
}
public class Downcasting_Upcasting {
    public static void main(String[] args) {
        Royal_Enfield obj = new Classic350();
        obj.sales();
        obj.model();
        ((Classic350)obj).maintainence();
        Royal_Enfield obj1 = new gt650();
        obj1.model();
        ((gt650)obj1).maintainence();
    }
}
