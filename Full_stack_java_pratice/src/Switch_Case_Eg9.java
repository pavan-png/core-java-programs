public class Switch_Case_Eg9 {
    public static void main(String[] args) {
        int a = 5;
        int x = 10;
        switch (x){
            case 10:
                a *=2;
            case 20:
                a *=3;
            case 30:
                a *=4;
        }
        System.out.println(" The value of a is  "+a);

    }
}
