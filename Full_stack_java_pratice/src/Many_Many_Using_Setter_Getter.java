public class Many_Many_Using_Setter_Getter {
    public static void main(String[] args) {
        Course_01 c_01 = new Course_01();
        c_01.setCourse_Name("java");
        c_01.setCourse_Id("#01");
        c_01.setCourse_Cost("10k");

        Course_01 c_02 = new Course_01();
        c_02.setCourse_Name("python");
        c_02.setCourse_Id("#02");
        c_02.setCourse_Cost("7.5k");

        Course_01 c_03 = new Course_01();
        c_03.setCourse_Name("sql");
        c_03.setCourse_Id("#03");
        c_03.setCourse_Cost("5k");


        Student_04 s1 = new Student_04();
        s1.setStudent_Name("pavan");
        s1.setStudent_Id("#123");
        s1.setStudent_Address("123-A");
        s1.setC(c_01);

        System.out.println(s1.getStudent_Name());
        System.out.println(s1.getStudent_Id());
        System.out.println(s1.getStudent_Address());
        System.out.println("----------------the course details are-----------------");
        System.out.println(s1.getC().getCourse_Name());
        System.out.println(s1.getC().getCourse_Id());
        System.out.println(s1.getC().getCourse_Cost());
        System.out.println("-----------------------------------------------");
        s1.setC(c_02);
        System.out.println(s1.getC().getCourse_Name());
        System.out.println(s1.getC().getCourse_Id());
        System.out.println(s1.getC().getCourse_Cost());
        System.out.println("-----------------------------------------------");
        s1.setC(c_03);
        System.out.println(s1.getC().getCourse_Name());
        System.out.println(s1.getC().getCourse_Id());
        System.out.println(s1.getC().getCourse_Cost());


        System.out.println("==============================the next student details  are================================== ");

        Student_04 s2 = new Student_04();
        s2.setStudent_Name("Anand");
        s2.setStudent_Id("#124");
        s2.setStudent_Address("123-B");
        s2.setC(c_01);

        System.out.println(s2.getStudent_Name());
        System.out.println(s2.getStudent_Id());
        System.out.println(s2.getStudent_Address());
        System.out.println("----------------the course details are-----------------");
        System.out.println(s2.getC().getCourse_Name());
        System.out.println(s2.getC().getCourse_Id());
        System.out.println(s2.getC().getCourse_Cost());
        System.out.println("-----------------------------------------------");
        s2.setC(c_02);
        System.out.println(s2.getC().getCourse_Name());
        System.out.println(s2.getC().getCourse_Id());
        System.out.println(s2.getC().getCourse_Cost());
        System.out.println("-----------------------------------------------");
        s2.setC(c_03);
        System.out.println(s2.getC().getCourse_Name());
        System.out.println(s2.getC().getCourse_Id());
        System.out.println(s2.getC().getCourse_Cost());
        System.out.println("==============================the next student details  are================================== ");

        Student_04 s3 = new Student_04();
        s3.setStudent_Name("charan");
        s3.setStudent_Id("#125");
        s3.setStudent_Address("123-C");
        s3.setC(c_01);
        System.out.println(s3.getStudent_Name());
        System.out.println(s3.getStudent_Id());
        System.out.println(s3.getStudent_Address());
        System.out.println("----------------the course details are-----------------");
        System.out.println(s3.getC().getCourse_Name());
        System.out.println(s3.getC().getCourse_Id());
        System.out.println(s3.getC().getCourse_Cost());
        System.out.println("-----------------------------------------------");
        s3.setC(c_02);
        System.out.println(s3.getC().getCourse_Name());
        System.out.println(s3.getC().getCourse_Id());
        System.out.println(s3.getC().getCourse_Cost());
        System.out.println("-----------------------------------------------");
        s3.setC(c_03);
        System.out.println(s3.getC().getCourse_Name());
        System.out.println(s3.getC().getCourse_Id());
        System.out.println(s3.getC().getCourse_Cost());
    }
}

