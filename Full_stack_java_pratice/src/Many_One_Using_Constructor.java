public class Many_One_Using_Constructor {
    public static void main(String[] args) {
        Branch_01 branch_01 = new Branch_01("cse","#023");
        Student_02 student_03 = new Student_02("pavan","#134","349-S",branch_01);
        Student_02 student_04 = new Student_02("guru charan","#135","350-S",branch_01);
        Student_02 student_05 = new Student_02("Anand","#136","351-S",branch_01);

        Student_02[] std = new Student_02[3];
        std[0] = student_03;
        std[1] = student_04;
        std[2] = student_05;

        for (Student_02 st :std ){
            st.getStudentdetails();
        }

    }
}
