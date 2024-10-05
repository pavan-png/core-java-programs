public enum Setter_Getter_In_Enum {
    JAVA, JEE, SPRINGBOOT;
    // public static final Course JAVA = new Course();

    int courseId;

     Setter_Getter_In_Enum(){
        System.out.println("Constructor");
    }

    void setCourseId(int courseId){
        this. courseId=courseId;
    }

    int getCourseId(){
        return courseId;
    }
    public static void main(String args[]){
        Setter_Getter_In_Enum.JAVA.setCourseId(10);
        int i = Setter_Getter_In_Enum.JAVA.getCourseId();
        System.out.println(i);

        /*
         since all the constants are static , they are loaded during class loading , and for every variable
         a new object is created , so that many times constructor is called.
         enmus cannot be instantiated directly , it can be done only through constants.
         */


    }
}
