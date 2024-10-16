import java.util.function.Predicate;

public class Array_With_Predicate_Test_Method_Eg4 {
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
        Predicate<Integer>  p2 = (Integer i)->{
            if (i%2==0){
                return true;
            }
            else {
                return false;
            }
        };

        Array_With_Predicate_Test_Method_Eg4 obj = new Array_With_Predicate_Test_Method_Eg4();
        obj.m1(p1.and(p2) , arr);
    }
    public void m1(Predicate p , int[] a){
        for (Integer  ele : a){
            if (p.test(ele)==true){
                System.out.print(ele + "  ");
            }
        }
    }

}
