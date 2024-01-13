public class Array_Eg5 {
    public static void main(String[] args) {
     int[][] n = {{1,3},{2,4}};
     for(int i = n.length-1; i>=0;i--){
         for(int y : n[i])
             System.out.print(y + " ");
         // for loop always iterate from left to right so 1st   2 and then 4 is printed
     }
    }
}
