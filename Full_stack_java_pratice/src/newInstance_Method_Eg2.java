public class newInstance_Method_Eg2  extends newInstance_Method{
    public static void main(String[] args) throws Exception{
        // take the input of the class name for which object has to be created at the runtime
    //    String className = args[0];

        // load the class file explictly
        Class c = Class.forName("newInstance_Method");

        // for the loaded class, object is created using zero parameter constructor only.
        Object obj = c.newInstance();

        // perform type casting to get newInstance object
        newInstance_Method_Eg2 ref = (newInstance_Method_Eg2) obj;
        // to perform typecasting there must be some parent to child (or) child to parent relation
        System.out.println(ref);
        System.out.println(ref.getClass().getName());
    }
}
