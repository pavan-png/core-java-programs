import java.lang.annotation.*;
// Element can be applied multiple times means , the annotation can be applied to constructor, method , field etc
// keep braces if you add multiple elements
@Target({ElementType.TYPE,ElementType.CONSTRUCTOR,ElementType.METHOD,ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
@interface Leader{
    String name() default "pavan kalyan";
    String position() default "prime minister";
}

@Leader
public class Target_Retention {
        private String prime_Minister;
        private String country;

        public String getCountry () {
            return country;
        }

        public void setCountry (String country){
            this.country = country;
        }

        public String getPrime_Minister () {
            return prime_Minister;
        }

        public void setPrime_Minister (String prime_Minister){
            this.prime_Minister = prime_Minister;
        }
    public static void main(String[] args) {
        Target_Retention t = new Target_Retention();
        t.setPrime_Minister("pavan");
        t.setCountry("india");
        System.out.println(t.getCountry());
        System.out.println(t.getPrime_Minister());


        // To get values of annotation can use reflection api
      // first get the class
       Class c =  t.getClass();
       // in that class get the details of the annotation
       Annotation an = c.getAnnotation(Leader.class);
       Leader tr = (Leader) an;
       System.out.println(tr.position());



    }

}