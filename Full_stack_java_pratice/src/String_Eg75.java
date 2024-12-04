public class String_Eg75 {
    public static void main(String[] args) {
        String[] arr = {"1st","2nd","3rd","4th","5th"};
        String place = "faraway";
        System.out.println(arr[place.indexOf('a',3)]);
        // here counting index start from 3 . and a is  present is 3 index   =>     arr[3]  => 4th

    }
}
