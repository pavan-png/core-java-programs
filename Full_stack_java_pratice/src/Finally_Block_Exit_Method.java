class Exit_Demo{
    void disp(){
        try{
            System.out.println("statement inside try");
            System.exit(0);
        }
        finally {
            System.out.println("statement inside finally");
        }
    }
}

public class Finally_Block_Exit_Method {
    public static void main(String[] args) {
        Exit_Demo obj = new Exit_Demo();
        obj.disp();
    }
}
