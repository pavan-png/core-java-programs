public class Typecasting_Underscore {
    public static void main(final String[] args) {
       /* from jdk 1.7 for a literal we can give "_" aso , if we give compiler will just remove
          in .class file */
        char c ='Z';
        long l = 100_00l;
        int i = 9_2;
        float f = 2.02f;
        double d = 10_0.35d;

        /*  char + int = int (means result will sit on higher data type i.e int here) we are storing int
         in long which is implicit typecasting */
        l = c+i;
        System.out.println(l);

        /* char * long * int * float  = float (float is bigger data type than long so result of data type of
        * this expression is float and we are storing in float , there is no need of any conversion   */
        f = c*l*i*f;
        System.out.println(f);

        /* long + int + char = long ( result data type of this expression is long and long can sit in float
        *    which is implicit type casting    */
        f = l+i+c;
        System.out.println(f);

         /* Here we are storing double in int which is not possible implicitly , because double is bigger i
         *  data type than int , so we have to type cast explicitly */
        i = (int)d;
        System.out.println(i);

        /* Here we are trying to store double in float which is not possible implicitly , because double is
        *  bigger dta type than float , so we have to type cast explicitly */
        f = (long)d;
    }
}
