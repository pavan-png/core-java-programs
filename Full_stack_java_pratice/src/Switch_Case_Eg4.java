public class Switch_Case_Eg4 {
    public static void main(String[] args) {
        int x = 10;
        final int y = 20;
        // final means compiler will get to know the  value and compiler treats  ts as  "compile time constant"

        switch (x){
            case 10:
                System.out.println("hello");
                break;
            case y :
                System.out.println("hi");
                break;
        }
    }
}
