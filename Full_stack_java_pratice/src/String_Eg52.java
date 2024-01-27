public class String_Eg52 {
    public static void main(String[] args) {
        String s1 = "Java";
        String s2 = new String("java");
         s1 = s2;
         if (s1==s2){
             System.out.println("equal");
         }
         else {
             System.out.println("not equal");
         }
        System.out.println(s1);
         String s3 = "java";
        System.out.println(s1==s3);

    }
}
