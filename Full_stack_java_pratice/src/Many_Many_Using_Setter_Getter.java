public class Many_Many_Using_Setter_Getter {

    public static void main(String[] args) {

        // Create Courses
        Course_01 c_01 = new Course_01();
        c_01.setCourse_Name("Java");
        c_01.setCourse_Id("#01");
        c_01.setCourse_Cost("10k");

        Course_01 c_02 = new Course_01();
        c_02.setCourse_Name("Python");
        c_02.setCourse_Id("#02");
        c_02.setCourse_Cost("7.5k");

        Course_01 c_03 = new Course_01();
        c_03.setCourse_Name("SQL");
        c_03.setCourse_Id("#03");
        c_03.setCourse_Cost("5k");

        Course_01[] allCourses = {c_01, c_02, c_03};

        // Create Students
        Student_04 s1 = new Student_04();
        s1.setStudent_Name("Pavan");
        s1.setStudent_Id("#123");
        s1.setStudent_Address("123-A");
        s1.setCourses(allCourses);

        Student_04 s2 = new Student_04();
        s2.setStudent_Name("Anand");
        s2.setStudent_Id("#124");
        s2.setStudent_Address("123-B");
        s2.setCourses(allCourses);

        Student_04 s3 = new Student_04();
        s3.setStudent_Name("Charan");
        s3.setStudent_Id("#125");
        s3.setStudent_Address("123-C");
        s3.setCourses(allCourses);

        Student_04[] allStudents = {s1, s2, s3};

        // Now link students back to courses (true many-to-many)
        c_01.setStudents(allStudents);
        c_02.setStudents(allStudents);
        c_03.setStudents(allStudents);

        // Print
        for (Student_04 s : allStudents) {

            System.out.println("Student : " + s.getStudent_Name());
            System.out.println("Courses Enrolled:");

            for (Course_01 c : s.getCourses()) {
                System.out.println("   " + c.getCourse_Name());
            }

            System.out.println("-----------------------------------");
        }
    }
}
