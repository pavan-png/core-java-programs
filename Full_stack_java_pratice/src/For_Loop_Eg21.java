public class For_Loop_Eg21 {
    public static void main(String[] args) {
        // you can store character in String but use double quotes , if used single quotes leads to C.E
        String[] arr = {"A" , "B" ,"C", "D" };
        for (int i =0; i<arr.length;i++){
            System.out.println(arr[i] + " ");
            if (arr[i].equals("C"))
                continue;
            System.out.println("Workdone");
            break;
        }
    }
}
