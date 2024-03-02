public class Switch_Eg19 {
    public static void main(String[] args) {
        // here we declared a string , and in the string a character array is declared.
        String fruit = new String( new char[] {'M','A','N','G','O'});
        switch (fruit){
            default : {
                System.out.println(" i will eat all the fruits");
            }

            case "APPLE" :
                System.out.println("this is  apple");
            case "MANGO" :
                System.out.println("this  is mango");
            case "BANANA" :
                System.out.println("this is  banana");
                break;

        }
    }
}
