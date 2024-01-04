public class Continue_Statement {
    public static void main(String[] args) {
        int i =1;
        // if iteration starts from 0 give i< ,if starts from 1 give i<=
        for (i=1;i<=5;i++){
            if (i==3){
                continue;
            }
        System.out.println(i);
        }
    }
}
