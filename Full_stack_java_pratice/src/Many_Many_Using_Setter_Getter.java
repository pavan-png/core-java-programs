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

        Student_04 s2 = new Student_04();
        s2.setStudent_Name("Anand");
        s2.setStudent_Id("#124");
        s2.setStudent_Address("123-B");
        s2.setC(c_01);

        Student_04 s3 = new Student_04();
        s3.setStudent_Name("charan");
        s3.setStudent_Id("#125");
        s3.setStudent_Address("123-C");
        s3.setC(c_01);

        Student_04[] arr = new Student_04[3];
        arr[0] = s1;
        arr[1] = s2;
        arr[2] = s3;

        Course_01[] arr1 = new Course_01[3];
        arr1[0] = c_01;
        arr1[1] = c_02;
        arr1[2] = c_03;

        for (int i = 0 ;i<arr.length;i++){
            System.out.println(arr[i].getStudent_Name());
            System.out.println(arr[i].getStudent_Id());
            System.out.println(arr[i].getStudent_Address());
            System.out.println("========================================");
            for (int j = 0;j<arr1.length;j++){
                arr[i].setC(arr1[j]);
                System.out.println(arr[i].getC().getCourse_Name());
                System.out.println(arr[i].getC().getCourse_Id());
                System.out.println(arr[i].getC().getCourse_Cost());
                System.out.println("=====================================================");
            }
        }
            /*
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

         */
    }
}

