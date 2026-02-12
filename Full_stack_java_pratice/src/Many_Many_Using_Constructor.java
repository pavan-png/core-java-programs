public class Many_Many_Using_Constructor {

    public static void main(String[] args) {

        // Temporary empty arrays (to resolve circular dependency)
        Student_03[] emptyStudents = new Student_03[3];

        Course course1 = new Course("Java", "#01", "10k", emptyStudents);
        Course course2 = new Course("Python", "#02", "7.5k", emptyStudents);
        Course course3 = new Course("SQL", "#03", "5k", emptyStudents);

        Course[] allCourses = { course1, course2, course3 };

        Student_03 s1 = new Student_03("Pavan", "Hp5A1", "123-A", allCourses);
        Student_03 s2 = new Student_03("Anand", "Hp592", "123-B", allCourses);
        Student_03 s3 = new Student_03("Charan", "Hp595", "123-C", allCourses);

        Student_03[] allStudents = { s1, s2, s3 };

        // Now assign students to courses (true many-to-many linking)
        course1 = new Course("Java", "#01", "10k", allStudents);
        course2 = new Course("Python", "#02", "7.5k", allStudents);
        course3 = new Course("SQL", "#03", "5k", allStudents);

        s1.get_Details();
        s2.get_Details();
        s3.get_Details();
    }
}
