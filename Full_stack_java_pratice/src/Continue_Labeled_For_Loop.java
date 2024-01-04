public class Continue_Labeled_For_Loop {
    public static void main(String[] args) {
        int i,j =1;
       aa:
        for (i=1;i<=3;i++){
          bb:
            for (j=1;j<=3;j++){
                if (i==2&j==2){
                    continue aa;
                }
                System.out.println(i + " " + j);
            }
        }
    }
}
