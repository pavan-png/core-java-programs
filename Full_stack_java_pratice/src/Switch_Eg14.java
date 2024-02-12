public class Switch_Eg14 {
    public static void main(String[] args) {
        String fruit = "mango";
        switch (fruit){
            case "Apple" :
                System.out.println("Apple");
            case "Mango" :
                System.out.println("Mango");
            case "Banana":
                System.out.println("Banana");
                break;
            default:
                System.out.println("Any fruit will do");
        }
    }
}
