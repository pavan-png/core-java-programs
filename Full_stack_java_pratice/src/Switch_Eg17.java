public class Switch_Eg17 {
    public static void main(String[] args) {
        String fruit = "mango";
        switch (fruit) {

            case "Apple":
                System.out.println("Apple");
            case "mango":
                System.out.println("mango");
            case "Grapes":
                System.out.println("Grapes");
                break;
            case "Banana":
                System.out.println("Banana");
            default:
                System.out.println("Any fruit will do");
        }
    }
}
