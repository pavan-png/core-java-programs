public class Type_Casting_Array_During_Retrival {
    public static void main(String[] args) {
        String name[] =new String[10];
        name[0] = "pavan";
        name[1] = "kalyan";
        String data =name[0];//here type casting is not required.
        System.out.println(data);

    }
}
