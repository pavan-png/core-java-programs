import java.util.function.Predicate;

public class Array_With_Predicate__Test_Method_Eg1 {
    public static void main(String[] args) {
        int[] arr = {5,10,15,20,25,30,35,40};
        Predicate p1 = (Object o)->{
            Integer i = (Integer) o;
            if (i>10){
                return true;
            }
            else
                return false;
        };

        Array_With_Predicate__Test_Method_Eg1 obj = new Array_With_Predicate__Test_Method_Eg1();
        obj.m1(p1,arr);
    }
    public void m1( Predicate p , int[] a){
        for (int ele:a){
           if (p.test(ele) == true){  // internally evaluates as p1.test(ele)
               System.out.print(ele + "   ");
           }

        }
    }
}
