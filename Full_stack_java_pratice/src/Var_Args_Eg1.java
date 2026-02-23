public class Var_Args_Eg1 {
    public static void add(int... numbers) {
        int sum = 0;
        for (int n : numbers) {
            sum += n;
        }
        System.out.println(sum);
    }

    public static void main(String[] args) {
        add();                // 0
        add(10);              // 10
        add(10, 20);          // 30
        add(10, 20, 30, 40);  // 100
    }
}