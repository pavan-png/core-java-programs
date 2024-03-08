class Special_String{
    String str ;
    Special_String( String str){
        this.str = str;
    }
}
public class String_Eg78 {
    public static void main(String[] args) {
        Object[] arr = new Object[4];
        for (int i = 1; i <= 3; i++) {
            switch (i){
                case 1 :
                    arr[i] = new String("java");
                    break;
                case 2:
                    arr[i] = new StringBuilder("java");
                    break;
                case 3:
                    arr[i] = new Special_String("java");
                    break;
            }
        }
        for (Object obj : arr){
            System.out.println(obj);
        }
    }
}
