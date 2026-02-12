public class Many_One_Using_Constructor {

    public static void main(String[] args) {

        // ONE Branch
        Branch_01 branch_01 = new Branch_01("CSE", "#023");

        // MANY Students (Constructor Injection)
        Student_02 student_03 =
                new Student_02("pavan", "#134", "349-S", branch_01);

        Student_02 student_04 =
                new Student_02("guru charan", "#135", "350-S", branch_01);

        Student_02 student_05 =
                new Student_02("Anand", "#136", "351-S", branch_01);

        Student_02[] students = {
                student_03,
                student_04,
                student_05
        };

        for (Student_02 st : students) {
            st.getStudentdetails();
        }
    }
}
