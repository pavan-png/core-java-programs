public class Label_break {
    public static void main(String[] args) {
        int x =10;
       label: {
            System.out.println("begin");
            if(x==10)
                 break label  ;
            System.out.println("end");
        }
        System.out.println("hello");

    }
}
