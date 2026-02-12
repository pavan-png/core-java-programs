public class Many_One_Association_Using_Setters_Getters {

    public static void main(String[] args) {

        // ONE Branch
        Branch branch = new Branch();
        branch.setBranch_Name("Computer Science");
        branch.setBraanch_Id("#01");

        // MANY Students
        Student_01 student_01 = new Student_01();
        student_01.setStudent_Name("pavan");
        student_01.setStudent_Id("#T123");
        student_01.setStudent_Address("Vijayawada");
        student_01.setBranch(branch);

        Student_01 student_02 = new Student_01();
        student_02.setStudent_Name("Anand");
        student_02.setStudent_Id("#W145");
        student_02.setStudent_Address("Vijayawada");
        student_02.setBranch(branch);

        Student_01 student_03 = new Student_01();
        student_03.setStudent_Name("Guru");
        student_03.setStudent_Id("#I879");
        student_03.setStudent_Address("Vijayawada");
        student_03.setBranch(branch);

        System.out.println("=========== Student Details ===========");
        student_01.displayStudentDetails();
        student_02.displayStudentDetails();
        student_03.displayStudentDetails();
    }
}
