public class Short_Circuit_AND_Operator {
    public static synchronized void main(String[] args) {
    int x =10,y=15;
    if(++x<10 && ++y>15){
        x++;
    }
    else {
        y++;
    }
    System.out.println("x = " +x +"  " +"y = "+y );
}
}
