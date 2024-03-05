public class String_Eg70 {
    public static void main(String[] args) {
        String res = "";
        loop:for (int i=1;i<=5;i++){
            switch (i){
                case 1:
                    res += "UP ";
                    break ;
                case 2:
                    res += "TO ";
                    break ;
                case 3:
                    break ;
                case 4:
                    res += "DATE";
                    break loop;
            }
        }
        System.out.println(res);
        System.out.println(String.join("-",res.split(" ")));

    }
}
