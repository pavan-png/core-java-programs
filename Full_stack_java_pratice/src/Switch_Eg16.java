public class Switch_Eg16 {
    public static void main(String[] args) {
        String fruit = "mango";
        switch (fruit) {

            case "Apple":
                System.out.println("Apple");
            case "Banana":
                System.out.println("Banana");
                break;
            case "mango":
                System.out.println("mango");
            default:
                System.out.println("Any fruit will do");
        }
    }
}
