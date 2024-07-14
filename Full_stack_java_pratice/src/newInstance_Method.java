public class newInstance_Method {
    public static void main(String[] args) throws Exception {
        Object obj = Class.forName(args[0]).newInstance();
        System.out.println(obj.getClass().getName());
    }
}
