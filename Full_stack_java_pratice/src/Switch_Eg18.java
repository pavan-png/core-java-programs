public class Switch_Eg18 {
    public static void main(String[] args) {
        byte b = 100;
        switch (b) {
            case 100 :
                System.out.println("var is 100 ");

                /*
                compile time error since literal is out of byte range
                case 200 :
                System.out.println("var is 200 ");

            */
        }
    }
}
