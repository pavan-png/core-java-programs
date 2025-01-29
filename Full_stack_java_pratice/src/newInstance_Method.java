public class newInstance_Method {
    public static void main(String[] args) throws Exception {
        Object obj = Class.forName(args[0]).newInstance();
        /* provide the classname during runtime command line arguments it will load manually, create the object
        object fof that class and store it in the reference obj
         */

        System.out.println(obj.getClass().getName());
    }
}
