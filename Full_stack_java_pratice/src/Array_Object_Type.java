import java.util.*;
class fan {
    int cost ;
    String brand_name;
    int no_Of_Wings;
}
public class Array_Object_Type {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // creating array of class type fan
        fan arr[] = new fan[3];

        // creating object of fan , and  reference variable is arr[0]
        arr[0] = new fan();
    arr[1] = new fan();
    arr[2] = new fan();

    arr[0].cost = 10000;
    arr[0].brand_name = "havells";
    arr[0].no_Of_Wings = 4;

        arr[1].cost = 15000;
        arr[1].brand_name = "orient";
        arr[1].no_Of_Wings = 4;

        arr[2].cost = 20000;
        arr[2].brand_name = "usha";
        arr[2].no_Of_Wings = 4;
            for (int j = 0; j < arr.length; j++) {
                System.out.println(arr[j].cost);
                System.out.println(arr[j].brand_name);
                System.out.println(arr[j].no_Of_Wings);
                System.out.println("-----------------------------------------------------");
                System.out.println();
            }
        }



    }

