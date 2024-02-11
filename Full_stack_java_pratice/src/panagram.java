public class panagram {
    public static void main(String[] args) {
        String s1 = "abcdefghijklmnopqrstuvwxyz";
        String s2 = "The quick brown fox jumps over the lazy dog";

        s2 = s2.toLowerCase();
        s2 = s2.replace(" ","");
        int count = 0;
        char[] arr = s1.toCharArray();
        char[] arr1 = s2.toCharArray();
        for (int i = 0 ; i<arr.length;i++ ){
            for (int j = 0 ; j<arr1.length;j++ ){
                if (arr[i]==arr1[j]){
                    count++;
                    break;
                }
            }
        }
        System.out.println(count);

        if (count == 26){
            System.out.println("The given string is a panagram ");
        }
        else {
            System.out.println("not a panagram");
        }
    }
}
