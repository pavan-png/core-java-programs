public class String_Eg88 {
    public static void main(String[] args) {
        System.out.println("java"+1000+2000+3000);
        // java+1000 => "java1000"+2000 => "java10002000" + 3000 => java100020003000

        System.out.println(1000+2000+3000+"java");
        //1000+2000 =>3000+3000 =>6000+"java" => 6000java

        System.out.println(7.7+3.3+"java"+3.3+7.7);
        // 7.7+3.3 => 11.0 + "java" => "11.0java" + 3.3 => "11.0java3.3" +7.7 => 11.0java3.37.7

        System.out.println("ONE"+2+3+4+"FIVE");
        // "ONE"+2 => "ONE2" +3 => "ONE23"+4 => ONE234+"FIVE" => ONE234FIVE
    }
}
