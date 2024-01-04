public class Nested_If {
    public static void main(String[] args) {
        String address = "vijayawada,india";
        if (address.endsWith("india")){
            if (address.contains("hyd")){
                System.out.println("the city is hyd ");
            }
            else if (address.contains("chennai")) {
                System.out.println("the city is chennai");
            }
            else {
                System.out.println("you are in vijaywada");
            }
        }
    }
}



