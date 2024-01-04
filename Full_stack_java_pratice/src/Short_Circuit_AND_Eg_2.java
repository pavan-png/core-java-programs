public class Short_Circuit_AND_Eg_2 {
    public static void main(String[] args) {
        int x = 10;
        if(++x < 10 && ((x/0)>10)){
            System.out.println("hello");
        }
        else {
            System.out.println("Hi");
        }
    }
}
