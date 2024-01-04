public class Nested_Switch_Case {
    public static void main(String[] args) {
        String education  = "btech";
        int year = 2;
        String branch = "cse";

        switch (education){
            case "degree":{
                System.out.println("degree");
                break;
            }
            case "btech":{
                System.out.println("btech");

                switch (branch){
                    case "ece":
                        System.out.println("ece");
                        break;
                    case "cse":
                        System.out.println("the group is cse");
                        break;
                }
            }

        }

    }
}
