public class Many_One_Association_Using_Setters_Getters {
    public static void main(String[] args) {
        Branch branch = new Branch();
        branch.setBranch_Name("computer science ");
        branch.setBraanch_Id("#01");

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

        System.out.println("================the student details are======================= ");
        System.out.println("the student name is : "+ student_01.getStudent_Name());
        System.out.println("the student id is : "+student_01.getStudent_Id());
        System.out.println("the student address is "+student_01.getStudent_Address());
        System.out.println("the student branch name is "+student_01.getBranch().getBranch_Name());
        System.out.println("the student branch id is "+student_01.getBranch().getBraanch_Id());
        System.out.println();
        System.out.println("the student name is : "+ student_02.getStudent_Name());
        System.out.println("the student id is : "+student_02.getStudent_Id());
        System.out.println("the student address is "+student_02.getStudent_Address());
        System.out.println("the student branch name is "+student_02.getBranch().getBranch_Name());
        System.out.println("the student branch id is "+student_02.getBranch().getBraanch_Id());
        System.out.println();
        System.out.println("the student name is : "+ student_03.getStudent_Name());
        System.out.println("the student id is : "+student_03.getStudent_Id());
        System.out.println("the student address is "+student_03.getStudent_Address());
        System.out.println("the student branch name is "+student_03.getBranch().getBranch_Name());
        System.out.println("the branch is  is "+student_03.getBranch().getBraanch_Id());
    }
}
