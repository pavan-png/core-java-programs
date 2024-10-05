@interface Single_Value{
    int data() default 10;
}

@interface  Single_Value_1{
    int data_1();
}

@Single_Value_1(data_1 = 10)
public class Single_Value_Annotation {
    public static void main(String[] args) {

    }
}
