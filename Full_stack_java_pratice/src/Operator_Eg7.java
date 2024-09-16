public class Operator_Eg7 {
    public static void main(String[] args) {
        Long tail = 2000L;
        Long distance = 1999L;
        Long story = 1000L;
        if ((tail>distance)^(story*2)==tail)
            System.out.println("1");
        if ((distance +1 != tail)^(story*2)==distance)
            System.out.println("2");
    }
}
