import java.util.Arrays;
// Arrays utility class is present in util package .
public class Arrays_Sort_Method {
    public static void main(String[] args) {
        int [] arr = {90,35,20,10,40,70,60,80,50};
        System.out.print("Before sorting  : ");
        for (int i : arr){
            System.out.print(i +"  ");
        }
        Arrays.sort(arr);
        System.out.println();
        System.out.print("After using sort method  : ");
        for (int i : arr){
            System.out.print(i +"  ");
        }
    }
}
