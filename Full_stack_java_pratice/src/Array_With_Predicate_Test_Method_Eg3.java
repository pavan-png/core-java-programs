import java.util.function.Predicate;

public class Array_With_Predicate_Test_Method_Eg3 {
    public static void main(String[] args) {
        int[] arr = {5,10,15,20,25,30,35,40};
        Predicate<Integer> p1 = (Integer i)->{
            if ((i>10) && (i%2==0)){
                return true;
            }
            else {
                return false;
            }
        };

    Array_With_Predicate_Test_Method_Eg3 obj = new Array_With_Predicate_Test_Method_Eg3();
    obj.m1(p1,arr);
    }

    public void m1(Predicate p , int[] a){
        for (Integer  ele : a){
            if (p.test(ele)==true){
                System.out.print(ele + "  ");
            }
        }
    }
}
