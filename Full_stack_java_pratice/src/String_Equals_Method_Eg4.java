public class String_Equals_Method_Eg4 {
    public static void main(String[] args) {
        // space is also compared in strings
        System.out.println("---------------------------with new keyword-----------------------------------");
        String s1 = new String("Hello");
        String s2 = new String("Hello");
       // compares the object
        System.out.println("without equals method : "+(s1==s2));
        // compares the content in the object
        System.out.println("with equals method  : "+s1.equals(s2));
        System.out.println();

        System.out.println("------------------------without new keyword-------------------------------------");
        System.out.println();
        // if both the strings does not have new keyword ,
        // the content in the object  is compared . even though if not used equals method.
        String s3 = "Hello";
        String s4 = "Hello";
        System.out.println("without equals method : "+(s3==s4));
        System.out.println("with equals method  : "+s3.equals(s4));
        System.out.println();
        System.out.println("------------------------1st one with new keyword , 2nd one without new keyword----------------");
        System.out.println();
        String s5  =  new String ("Hello");
        String s6 = "Hello";
        System.out.println("without equals method : "+(s5==s6));
        System.out.println("with equals method  : "+s5.equals(s6));






    }
}
