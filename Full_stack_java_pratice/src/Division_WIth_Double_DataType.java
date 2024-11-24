public class Division_WIth_Double_DataType {
    public static void main(String[] args) {
        double a = 23;
        System.out.println("zero by double "+0/a);
        System.out.println("double by zero"+a/0);

        double b = 0;
        double c= 0;
        System.out.println("double zero by double " +b/c);


         System.out.println("zero by zero" +0/0);
        // leads to AirthmeticException, by default compiler treats a whole number as int so it results in A.E
    }
}
