public class Switch_Case_Eg12 {
    public static void main(String[] args) {
    int a = 3;
    switch (a){
        case 1 : ++a;
        case 2 : a++;
        case 3 : ++a;
        default : a++;
        // default will execute only when there is no matching cases. it will not execute even if there is no break in previous
            // matching cases
    }
        System.out.println(a);

    }
}
