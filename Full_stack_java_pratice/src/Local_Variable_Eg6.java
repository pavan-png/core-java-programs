public class Local_Variable_Eg6 {
    public static void main(String[] args) {
        int x =5;
        Local_Variable_Eg6 p = new Local_Variable_Eg6();
        p.doStuff( x);
        System.out.println(" main x = " + x);
    }
    void doStuff(int x){
        System.out.println(" do stuff x = " + x++ );
    }
}
