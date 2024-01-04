public class For_Loop_Eg2 {
    public static void main(String[] args) {
        Integer x = 0;
        Integer y = 0;
        for (Short z = 0 ; z <5 ; z++)
            if((++x>2) || (++y>2))
                x++;
        System.out.println("x = "+ x  +"  y = " +y );


    }
}
