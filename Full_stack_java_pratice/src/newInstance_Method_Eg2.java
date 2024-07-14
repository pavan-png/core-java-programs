public class newInstance_Method_Eg2 {
    public static void main(String[] args) throws Exception{
        // take the input of the class name for which object has to be created at the runtime
        String ClassName = args[0];

        // load the class file explictly
        Class c = Class.forName(args[0]);

        // for the loaded class , object is created using zero parameter constructor only.
        Object obj = c.newInstance();

        // perform type casting to get newInstance object
        newInstance_Method_Eg2 ref = (newInstance_Method_Eg2) obj;
        System.out.println(ref);
        System.out.println(ref.getClass().getName());
    }
}
