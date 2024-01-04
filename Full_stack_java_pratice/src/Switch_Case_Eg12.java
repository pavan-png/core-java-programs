public class Switch_Case_Eg12 {
    public static void main(String[] args) {
    int a = 3;
    switch (a){
        case 1 : ++a;
        case 2 : a++;
        case 3 : ++a;
        default : a++;
    }
        System.out.println(a);

    }
}
